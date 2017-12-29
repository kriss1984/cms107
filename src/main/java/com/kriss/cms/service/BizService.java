package com.kriss.cms.service;

import com.kriss.cms.mybatis.dao.ArticleDao;
import com.kriss.cms.mybatis.dao.BizDao;
import com.kriss.cms.mybatis.dto.CrmRegiste;
import com.kriss.util.Pager;

import java.util.List;
import java.util.Map;

public class BizService {

    public void saveReg(CrmRegiste crmRegiste) {
        BizDao bizDao = new BizDao();
        bizDao.saveReg(crmRegiste);
    }

    public void listRegs(Pager pager) {
        BizDao bizDao = new BizDao();
        bizDao.listRegs(pager);
    }

    public List listRegsByMap(Map condition){
        BizDao bizDao = new BizDao();
        return bizDao.listRegsByMap(condition);
    }

}
