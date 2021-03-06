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

package com.liferay.osb.scv.user.mapper.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.AuditedModel;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the UserMappingRule service. Represents a row in the &quot;OSB_SCV_UserMappingRule&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.osb.scv.user.mapper.model.impl.UserMappingRuleModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.osb.scv.user.mapper.model.impl.UserMappingRuleImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserMappingRule
 * @see com.liferay.osb.scv.user.mapper.model.impl.UserMappingRuleImpl
 * @see com.liferay.osb.scv.user.mapper.model.impl.UserMappingRuleModelImpl
 * @generated
 */
@ProviderType
public interface UserMappingRuleModel extends AuditedModel,
	BaseModel<UserMappingRule>, ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a user mapping rule model instance should use the {@link UserMappingRule} interface instead.
	 */

	/**
	 * Returns the primary key of this user mapping rule.
	 *
	 * @return the primary key of this user mapping rule
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this user mapping rule.
	 *
	 * @param primaryKey the primary key of this user mapping rule
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the user mapping rule ID of this user mapping rule.
	 *
	 * @return the user mapping rule ID of this user mapping rule
	 */
	public long getUserMappingRuleId();

	/**
	 * Sets the user mapping rule ID of this user mapping rule.
	 *
	 * @param userMappingRuleId the user mapping rule ID of this user mapping rule
	 */
	public void setUserMappingRuleId(long userMappingRuleId);

	/**
	 * Returns the company ID of this user mapping rule.
	 *
	 * @return the company ID of this user mapping rule
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this user mapping rule.
	 *
	 * @param companyId the company ID of this user mapping rule
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this user mapping rule.
	 *
	 * @return the user ID of this user mapping rule
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this user mapping rule.
	 *
	 * @param userId the user ID of this user mapping rule
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this user mapping rule.
	 *
	 * @return the user uuid of this user mapping rule
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this user mapping rule.
	 *
	 * @param userUuid the user uuid of this user mapping rule
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this user mapping rule.
	 *
	 * @return the user name of this user mapping rule
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this user mapping rule.
	 *
	 * @param userName the user name of this user mapping rule
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this user mapping rule.
	 *
	 * @return the create date of this user mapping rule
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this user mapping rule.
	 *
	 * @param createDate the create date of this user mapping rule
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this user mapping rule.
	 *
	 * @return the modified date of this user mapping rule
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this user mapping rule.
	 *
	 * @param modifiedDate the modified date of this user mapping rule
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the mapping data source ID of this user mapping rule.
	 *
	 * @return the mapping data source ID of this user mapping rule
	 */
	public long getMappingDataSourceId();

	/**
	 * Sets the mapping data source ID of this user mapping rule.
	 *
	 * @param mappingDataSourceId the mapping data source ID of this user mapping rule
	 */
	public void setMappingDataSourceId(long mappingDataSourceId);

	/**
	 * Returns the field set ID of this user mapping rule.
	 *
	 * @return the field set ID of this user mapping rule
	 */
	public long getFieldSetId();

	/**
	 * Sets the field set ID of this user mapping rule.
	 *
	 * @param fieldSetId the field set ID of this user mapping rule
	 */
	public void setFieldSetId(long fieldSetId);

	/**
	 * Returns the model name of this user mapping rule.
	 *
	 * @return the model name of this user mapping rule
	 */
	@AutoEscape
	public String getModelName();

	/**
	 * Sets the model name of this user mapping rule.
	 *
	 * @param modelName the model name of this user mapping rule
	 */
	public void setModelName(String modelName);

	/**
	 * Returns the source field of this user mapping rule.
	 *
	 * @return the source field of this user mapping rule
	 */
	@AutoEscape
	public String getSourceField();

	/**
	 * Sets the source field of this user mapping rule.
	 *
	 * @param sourceField the source field of this user mapping rule
	 */
	public void setSourceField(String sourceField);

	/**
	 * Returns the destination field of this user mapping rule.
	 *
	 * @return the destination field of this user mapping rule
	 */
	@AutoEscape
	public String getDestinationField();

	/**
	 * Sets the destination field of this user mapping rule.
	 *
	 * @param destinationField the destination field of this user mapping rule
	 */
	public void setDestinationField(String destinationField);

	/**
	 * Returns the field type of this user mapping rule.
	 *
	 * @return the field type of this user mapping rule
	 */
	@AutoEscape
	public String getFieldType();

	/**
	 * Sets the field type of this user mapping rule.
	 *
	 * @param fieldType the field type of this user mapping rule
	 */
	public void setFieldType(String fieldType);

	/**
	 * Returns the frequency of this user mapping rule.
	 *
	 * @return the frequency of this user mapping rule
	 */
	public int getFrequency();

	/**
	 * Sets the frequency of this user mapping rule.
	 *
	 * @param frequency the frequency of this user mapping rule
	 */
	public void setFrequency(int frequency);

	/**
	 * Returns the required of this user mapping rule.
	 *
	 * @return the required of this user mapping rule
	 */
	public boolean getRequired();

	/**
	 * Returns <code>true</code> if this user mapping rule is required.
	 *
	 * @return <code>true</code> if this user mapping rule is required; <code>false</code> otherwise
	 */
	public boolean isRequired();

	/**
	 * Sets whether this user mapping rule is required.
	 *
	 * @param required the required of this user mapping rule
	 */
	public void setRequired(boolean required);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(UserMappingRule userMappingRule);

	@Override
	public int hashCode();

	@Override
	public CacheModel<UserMappingRule> toCacheModel();

	@Override
	public UserMappingRule toEscapedModel();

	@Override
	public UserMappingRule toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}