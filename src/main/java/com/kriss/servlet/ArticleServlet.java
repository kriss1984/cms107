package com.kriss.servlet;

import com.kriss.cms.mybatis.dto.CmsArticle;
import com.kriss.cms.service.ArticleService;
import com.kriss.util.DateUtil;
import com.kriss.util.IDGenerator;
import com.kriss.util.PropertiesUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Date;
import java.util.Random;

public class ArticleServlet extends HttpServlet {

    ArticleService  articleService  = new ArticleService();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String m  = req.getParameter("m");
       if("saveArticle".equals(m)){
           CmsArticle  cmsArticle = new CmsArticle();
           cmsArticle.setUuid(IDGenerator.uuid());
           cmsArticle.setArticleContent(req.getParameter("articleContent"));
           cmsArticle.setArticleTitle(req.getParameter("articleTitle"));
           cmsArticle.setCreateTime(new Date());
           articleService.saveArticle(cmsArticle);
           //静态化
           String link = staticHtml(cmsArticle);
           cmsArticle.setPath(link);
           System.out.println(link);
       }
    }

    private String  staticHtml(CmsArticle cmsArticle ){
        String appBase = this.getServletContext().getRealPath("/");
        String link="/articles/"+ DateUtil.getDateString(new Date(),"MM")+ "/";
        File  afile  =new File(appBase+link);
        if(!afile.exists())
            afile.mkdirs();
        link+=DateUtil.getDateString(new Date(),"yyyyMMddHHmm")+new Random().nextInt(9999)+".html";
        try {
            FileInputStream fis = new FileInputStream(this.getServletContext().getRealPath("/articles/templates/"+PropertiesUtil.params.get("sys.ar.template")));
            BufferedReader  br  = new BufferedReader(new InputStreamReader(fis));
            String line = null;
            StringBuffer arContent = new StringBuffer();
            while((line=br.readLine())!=null){
                arContent.append(line);
            }
            br.close();
            String  content  = arContent.toString();
            content=content.replace("#param.title#", PropertiesUtil.params.get("ar.title"));
            content=content.replace("#param.keywords#", PropertiesUtil.params.get("ar.keywords"));
            content=content.replace("#param.description#", PropertiesUtil.params.get("ar.description"));
            content=content.replace("#articleTitle#",cmsArticle.getArticleTitle());
            content=content.replace("#articleContent#",cmsArticle.getArticleContent());
            FileOutputStream fos = new FileOutputStream(this.getServletContext().getRealPath("/")+link);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fos,"UTF-8"));
            bufferedWriter.write(content,0,content.length());
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return link;
    }
}
