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

package com.liferay.osb.scv.user.profile.model;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.GetterUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Matthew Kong
 */
public class DataSourceEntry {

	public DataSourceEntry() {
		this(null, null);
	}

	public DataSourceEntry(String dataSourceEntryId) {
		this(dataSourceEntryId, null);
	}

	public DataSourceEntry(String dataSourceEntryId, String source) {
		this.dataSourceEntryId = dataSourceEntryId;

		try {
			sourceJSONObject = JSONFactoryUtil.createJSONObject(source);
		}
		catch (Exception e) {
		}
	}

	public void addProperties(JSONObject jsonObject) {
		Iterator<String> iterator = jsonObject.keys();

		while (iterator.hasNext()) {
			String key = iterator.next();

			addProperty(key, jsonObject.get(key));
		}
	}

	public void addProperty(String key, Object value) {
		sourceJSONObject.put(key, value);
	}

	public String getDataSourceEntryId() {
		return dataSourceEntryId;
	}

	public List<String> getKeys() {
		List<String> keys = new ArrayList<>();

		Iterator<String> iterator = sourceJSONObject.keys();

		while (iterator.hasNext()) {
			keys.add(iterator.next());
		}

		return keys;
	}

	public Object getProperty(String key) {
		return sourceJSONObject.get(key);
	}

	public String getSource() {
		return sourceJSONObject.toString();
	}

	public long getTimestamp(String key) {
		return sourceJSONObject.getLong(key + "_timestamp");
	}

	protected String dataSourceEntryId;
	protected JSONObject sourceJSONObject;

}