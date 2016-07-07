package com.wbl.dao;

import java.sql.Timestamp;
import java.util.List;

import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wbl.pojo.Sms;

/**
 * A data access object (DAO) providing persistence and search support for Sms
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.wbl.dao.Sms
 * @author MyEclipse Persistence Tools
 */
public class SmsDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(SmsDAO.class);
	// property constants
	public static final String CODE = "code";
	public static final String SRC_MOBILE = "srcMobile";
	public static final String DEST_MOBILE = "destMobile";
	public static final String MESSAGE = "message";
	public static final String TYPE = "type";
	public static final String SYS_NAME = "sysName";
	public static final String STATUS = "status";
	public static final String RESULT = "result";
	public static final String REMARK = "remark";

	protected void initDao() {
		// do nothing
	}

	public void save(Sms transientInstance) {
		log.debug("saving Sms instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Sms persistentInstance) {
		log.debug("deleting Sms instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Sms findById(java.lang.String id) {
		log.debug("getting Sms instance with id: " + id);
		try {
			Sms instance = (Sms) getHibernateTemplate().get("com.wbl.dao.Sms",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Sms instance) {
		log.debug("finding Sms instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Sms instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Sms as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCode(Object code) {
		return findByProperty(CODE, code);
	}

	public List findBySrcMobile(Object srcMobile) {
		return findByProperty(SRC_MOBILE, srcMobile);
	}

	public List findByDestMobile(Object destMobile) {
		return findByProperty(DEST_MOBILE, destMobile);
	}

	public List findByMessage(Object message) {
		return findByProperty(MESSAGE, message);
	}

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findBySysName(Object sysName) {
		return findByProperty(SYS_NAME, sysName);
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List findByResult(Object result) {
		return findByProperty(RESULT, result);
	}

	public List findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

	public List findAll() {
		log.debug("finding all Sms instances");
		try {
			String queryString = "from Sms";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Sms merge(Sms detachedInstance) {
		log.debug("merging Sms instance");
		try {
			Sms result = (Sms) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Sms instance) {
		log.debug("attaching dirty Sms instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Sms instance) {
		log.debug("attaching clean Sms instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SmsDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SmsDAO) ctx.getBean("SmsDAO");
	}
}