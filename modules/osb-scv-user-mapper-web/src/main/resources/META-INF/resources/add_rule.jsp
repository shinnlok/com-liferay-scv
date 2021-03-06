<%--
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
--%>

<%@ include file="/init.jsp" %>

<%
String redirect = ParamUtil.getString(request, "redirect");

long mappingDataSourceId = ParamUtil.getLong(request, "mappingDataSourceId");

List<MappingDataSource> mappingDataSources = MappingDataSourceServiceUtil.getMappingDataSources();

MappingDataSource mappingDataSource = MappingDataSourceLocalServiceUtil.fetchMappingDataSource(mappingDataSourceId);

if ((mappingDataSource == null) && !mappingDataSources.isEmpty()) {
	mappingDataSource = mappingDataSources.get(0);
}

if (mappingDataSource == null) {
%>
	ADD DATA SOURCE!
<%
	return;
}

String tableName = ParamUtil.getString(request, "tableName");

List<String> tableNames = mappingDataSource.getTableNames();

if (Validator.isBlank(tableName) && !tableNames.isEmpty()) {
	tableName = tableNames.get(0);
}

String fieldType = null;
%>

<liferay-ui:header
	backURL="<%= redirect %>"
	title="add-user-mapping-rule"
/>

<liferay-portlet:actionURL name="addUserMappingRule" var="addUserMappingRuleURL" />

<aui:form action="<%= addUserMappingRuleURL %>" cssClass="container-fluid-1280" method="post" name="fm">
	<aui:input name="redirect" type="hidden" value="<%= redirect %>" />

	<aui:input label="destination-field" name="destinationField" type="text" wrapperCssClass="lfr-input-text-container">
		<aui:validator name="required" />
	</aui:input>

	<aui:select label="data-source" name="mappingDataSourceId">

		<%
		for (MappingDataSource curDataSource : mappingDataSources) {
		%>

			<aui:option localizeLabel="<%= false %>" label="<%= curDataSource.getName() %>" selected="<%= curDataSource.getMappingDataSourceId() == mappingDataSourceId %>" value="<%= curDataSource.getMappingDataSourceId() %>" />

		<%
		}
		%>

	</aui:select>

	<aui:select label="table-name" name="tableName">

		<%
		for (String curTableName : mappingDataSource.getTableNames()) {
		%>

			<aui:option localizeLabel="<%= false %>" label="<%= curTableName %>" selected="<%= curTableName == tableName %>" value="<%= curTableName %>" />

		<%
		}
		%>

	</aui:select>

	<aui:select label="source-field" name="sourceField">

		<%
		Map<String, String> map = mappingDataSource.getAvailableFields(tableName);

		for (Map.Entry<String, String> entry : map.entrySet()) {
		%>

			<aui:option localizeLabel="<%= false %>" label="<%= entry.getKey() %>" value="<%= entry.getKey() %>" />

		<%
		fieldType = entry.getValue();
		}
		%>

	</aui:select>

	<aui:input name="fieldType" type="hidden" value="<%= fieldType %>" />

	<aui:select label="frequency" name="frequency">

		<%
		for (Frequency frequency : FrequencyUtil.getFrequencies()) {
		%>

			<aui:option label="<%= frequency.getName() %>" value="<%= frequency.getFrequencyId() %>" />

		<%
		}
		%>

	</aui:select>

	<aui:select label="field-set" name="fieldSet">

		<%
		for (FieldSet fieldSet : FieldSetUtil.getFieldSets()) {
		%>

			<aui:option label="<%= fieldSet.getName() %>" value="<%= fieldSet.getFieldSetId() %>" />

		<%
		}
		%>

	</aui:select>

	<aui:button-row>
		<aui:button type="submit" />
	</aui:button-row>
</aui:form>

<aui:script>
	var form = $('#<portlet:namespace />fm');

	var sourceField = form.fm('sourceField');
	var mappingDataSourceId = form.fm('mappingDataSourceId');
	var destinationField = form.fm('destinationField');
	var frequency = form.fm('frequency');
	var fieldSet = form.fm('fieldSet');
	var tableName = form.fm('tableName');

	mappingDataSourceId.on(
		'change',
		function() {
			var data = {
				sourceField: sourceField.val(),
				mappingDataSourceId: mappingDataSourceId.val(),
				destinationField: destinationField.val(),
				frequency: frequency.val(),
				tableName: tableName.val(),
				fieldSet: fieldSet.val()
			};

			Liferay.Portlet.refresh('#p_p_id<portlet:namespace />', Liferay.Util.ns('<portlet:namespace />', data));
		}
	)

	tableName.on(
		'change',
		function() {
			var data = {
				sourceField: sourceField.val(),
				mappingDataSourceId: mappingDataSourceId.val(),
				destinationField: destinationField.val(),
				frequency: frequency.val(),
				tableName: tableName.val(),
				fieldSet: fieldSet.val()
			};

			Liferay.Portlet.refresh('#p_p_id<portlet:namespace />', Liferay.Util.ns('<portlet:namespace />', data));
		}
	)
</aui:script>