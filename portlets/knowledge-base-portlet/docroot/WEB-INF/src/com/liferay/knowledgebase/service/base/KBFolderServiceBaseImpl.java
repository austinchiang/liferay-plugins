/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.knowledgebase.service.base;

import com.liferay.knowledgebase.model.KBFolder;
import com.liferay.knowledgebase.service.KBFolderService;
import com.liferay.knowledgebase.service.persistence.KBArticlePersistence;
import com.liferay.knowledgebase.service.persistence.KBCommentPersistence;
import com.liferay.knowledgebase.service.persistence.KBFolderPersistence;
import com.liferay.knowledgebase.service.persistence.KBTemplatePersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.ClassNamePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the k b folder remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.knowledgebase.service.impl.KBFolderServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.knowledgebase.service.impl.KBFolderServiceImpl
 * @see com.liferay.knowledgebase.service.KBFolderServiceUtil
 * @generated
 */
public abstract class KBFolderServiceBaseImpl extends BaseServiceImpl
	implements KBFolderService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.knowledgebase.service.KBFolderServiceUtil} to access the k b folder remote service.
	 */

	/**
	 * Returns the k b article local service.
	 *
	 * @return the k b article local service
	 */
	public com.liferay.knowledgebase.service.KBArticleLocalService getKBArticleLocalService() {
		return kbArticleLocalService;
	}

	/**
	 * Sets the k b article local service.
	 *
	 * @param kbArticleLocalService the k b article local service
	 */
	public void setKBArticleLocalService(
		com.liferay.knowledgebase.service.KBArticleLocalService kbArticleLocalService) {
		this.kbArticleLocalService = kbArticleLocalService;
	}

	/**
	 * Returns the k b article remote service.
	 *
	 * @return the k b article remote service
	 */
	public com.liferay.knowledgebase.service.KBArticleService getKBArticleService() {
		return kbArticleService;
	}

	/**
	 * Sets the k b article remote service.
	 *
	 * @param kbArticleService the k b article remote service
	 */
	public void setKBArticleService(
		com.liferay.knowledgebase.service.KBArticleService kbArticleService) {
		this.kbArticleService = kbArticleService;
	}

	/**
	 * Returns the k b article persistence.
	 *
	 * @return the k b article persistence
	 */
	public KBArticlePersistence getKBArticlePersistence() {
		return kbArticlePersistence;
	}

	/**
	 * Sets the k b article persistence.
	 *
	 * @param kbArticlePersistence the k b article persistence
	 */
	public void setKBArticlePersistence(
		KBArticlePersistence kbArticlePersistence) {
		this.kbArticlePersistence = kbArticlePersistence;
	}

	/**
	 * Returns the k b comment local service.
	 *
	 * @return the k b comment local service
	 */
	public com.liferay.knowledgebase.service.KBCommentLocalService getKBCommentLocalService() {
		return kbCommentLocalService;
	}

	/**
	 * Sets the k b comment local service.
	 *
	 * @param kbCommentLocalService the k b comment local service
	 */
	public void setKBCommentLocalService(
		com.liferay.knowledgebase.service.KBCommentLocalService kbCommentLocalService) {
		this.kbCommentLocalService = kbCommentLocalService;
	}

	/**
	 * Returns the k b comment remote service.
	 *
	 * @return the k b comment remote service
	 */
	public com.liferay.knowledgebase.service.KBCommentService getKBCommentService() {
		return kbCommentService;
	}

	/**
	 * Sets the k b comment remote service.
	 *
	 * @param kbCommentService the k b comment remote service
	 */
	public void setKBCommentService(
		com.liferay.knowledgebase.service.KBCommentService kbCommentService) {
		this.kbCommentService = kbCommentService;
	}

	/**
	 * Returns the k b comment persistence.
	 *
	 * @return the k b comment persistence
	 */
	public KBCommentPersistence getKBCommentPersistence() {
		return kbCommentPersistence;
	}

	/**
	 * Sets the k b comment persistence.
	 *
	 * @param kbCommentPersistence the k b comment persistence
	 */
	public void setKBCommentPersistence(
		KBCommentPersistence kbCommentPersistence) {
		this.kbCommentPersistence = kbCommentPersistence;
	}

	/**
	 * Returns the k b folder local service.
	 *
	 * @return the k b folder local service
	 */
	public com.liferay.knowledgebase.service.KBFolderLocalService getKBFolderLocalService() {
		return kbFolderLocalService;
	}

	/**
	 * Sets the k b folder local service.
	 *
	 * @param kbFolderLocalService the k b folder local service
	 */
	public void setKBFolderLocalService(
		com.liferay.knowledgebase.service.KBFolderLocalService kbFolderLocalService) {
		this.kbFolderLocalService = kbFolderLocalService;
	}

	/**
	 * Returns the k b folder remote service.
	 *
	 * @return the k b folder remote service
	 */
	public com.liferay.knowledgebase.service.KBFolderService getKBFolderService() {
		return kbFolderService;
	}

	/**
	 * Sets the k b folder remote service.
	 *
	 * @param kbFolderService the k b folder remote service
	 */
	public void setKBFolderService(
		com.liferay.knowledgebase.service.KBFolderService kbFolderService) {
		this.kbFolderService = kbFolderService;
	}

	/**
	 * Returns the k b folder persistence.
	 *
	 * @return the k b folder persistence
	 */
	public KBFolderPersistence getKBFolderPersistence() {
		return kbFolderPersistence;
	}

	/**
	 * Sets the k b folder persistence.
	 *
	 * @param kbFolderPersistence the k b folder persistence
	 */
	public void setKBFolderPersistence(KBFolderPersistence kbFolderPersistence) {
		this.kbFolderPersistence = kbFolderPersistence;
	}

	/**
	 * Returns the k b template local service.
	 *
	 * @return the k b template local service
	 */
	public com.liferay.knowledgebase.service.KBTemplateLocalService getKBTemplateLocalService() {
		return kbTemplateLocalService;
	}

	/**
	 * Sets the k b template local service.
	 *
	 * @param kbTemplateLocalService the k b template local service
	 */
	public void setKBTemplateLocalService(
		com.liferay.knowledgebase.service.KBTemplateLocalService kbTemplateLocalService) {
		this.kbTemplateLocalService = kbTemplateLocalService;
	}

	/**
	 * Returns the k b template remote service.
	 *
	 * @return the k b template remote service
	 */
	public com.liferay.knowledgebase.service.KBTemplateService getKBTemplateService() {
		return kbTemplateService;
	}

	/**
	 * Sets the k b template remote service.
	 *
	 * @param kbTemplateService the k b template remote service
	 */
	public void setKBTemplateService(
		com.liferay.knowledgebase.service.KBTemplateService kbTemplateService) {
		this.kbTemplateService = kbTemplateService;
	}

	/**
	 * Returns the k b template persistence.
	 *
	 * @return the k b template persistence
	 */
	public KBTemplatePersistence getKBTemplatePersistence() {
		return kbTemplatePersistence;
	}

	/**
	 * Sets the k b template persistence.
	 *
	 * @param kbTemplatePersistence the k b template persistence
	 */
	public void setKBTemplatePersistence(
		KBTemplatePersistence kbTemplatePersistence) {
		this.kbTemplatePersistence = kbTemplatePersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name remote service.
	 *
	 * @return the class name remote service
	 */
	public com.liferay.portal.service.ClassNameService getClassNameService() {
		return classNameService;
	}

	/**
	 * Sets the class name remote service.
	 *
	 * @param classNameService the class name remote service
	 */
	public void setClassNameService(
		com.liferay.portal.service.ClassNameService classNameService) {
		this.classNameService = classNameService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return KBFolder.class;
	}

	protected String getModelClassName() {
		return KBFolder.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = kbFolderPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.liferay.knowledgebase.service.KBArticleLocalService.class)
	protected com.liferay.knowledgebase.service.KBArticleLocalService kbArticleLocalService;
	@BeanReference(type = com.liferay.knowledgebase.service.KBArticleService.class)
	protected com.liferay.knowledgebase.service.KBArticleService kbArticleService;
	@BeanReference(type = KBArticlePersistence.class)
	protected KBArticlePersistence kbArticlePersistence;
	@BeanReference(type = com.liferay.knowledgebase.service.KBCommentLocalService.class)
	protected com.liferay.knowledgebase.service.KBCommentLocalService kbCommentLocalService;
	@BeanReference(type = com.liferay.knowledgebase.service.KBCommentService.class)
	protected com.liferay.knowledgebase.service.KBCommentService kbCommentService;
	@BeanReference(type = KBCommentPersistence.class)
	protected KBCommentPersistence kbCommentPersistence;
	@BeanReference(type = com.liferay.knowledgebase.service.KBFolderLocalService.class)
	protected com.liferay.knowledgebase.service.KBFolderLocalService kbFolderLocalService;
	@BeanReference(type = com.liferay.knowledgebase.service.KBFolderService.class)
	protected com.liferay.knowledgebase.service.KBFolderService kbFolderService;
	@BeanReference(type = KBFolderPersistence.class)
	protected KBFolderPersistence kbFolderPersistence;
	@BeanReference(type = com.liferay.knowledgebase.service.KBTemplateLocalService.class)
	protected com.liferay.knowledgebase.service.KBTemplateLocalService kbTemplateLocalService;
	@BeanReference(type = com.liferay.knowledgebase.service.KBTemplateService.class)
	protected com.liferay.knowledgebase.service.KBTemplateService kbTemplateService;
	@BeanReference(type = KBTemplatePersistence.class)
	protected KBTemplatePersistence kbTemplatePersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ClassNameLocalService.class)
	protected com.liferay.portal.service.ClassNameLocalService classNameLocalService;
	@BeanReference(type = com.liferay.portal.service.ClassNameService.class)
	protected com.liferay.portal.service.ClassNameService classNameService;
	@BeanReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private KBFolderServiceClpInvoker _clpInvoker = new KBFolderServiceClpInvoker();
}