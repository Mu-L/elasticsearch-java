/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.ExpandWildcard;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch._types.mapping.DynamicMapping;
import co.elastic.clients.elasticsearch._types.mapping.DynamicTemplate;
import co.elastic.clients.elasticsearch._types.mapping.FieldNamesField;
import co.elastic.clients.elasticsearch._types.mapping.Property;
import co.elastic.clients.elasticsearch._types.mapping.RoutingField;
import co.elastic.clients.elasticsearch._types.mapping.RuntimeField;
import co.elastic.clients.elasticsearch._types.mapping.SourceField;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.NamedValue;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: indices.put_mapping.Request

/**
 * Update field mappings. Add new fields to an existing data stream or index.
 * You can use the update mapping API to:
 * <ul>
 * <li>Add a new field to an existing index</li>
 * <li>Update mappings for multiple indices in a single request</li>
 * <li>Add new properties to an object field</li>
 * <li>Enable multi-fields for an existing field</li>
 * <li>Update supported mapping parameters</li>
 * <li>Change a field's mapping using reindexing</li>
 * <li>Rename a field using a field alias</li>
 * </ul>
 * <p>
 * Learn how to use the update mapping API with practical examples in the
 * <a href=
 * "https://www.elastic.co/docs//manage-data/data-store/mapping/update-mappings-examples">Update
 * mapping API examples</a> guide.
 * 
 * @see <a href="../doc-files/api-spec.html#indices.put_mapping.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutMappingRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final FieldNamesField fieldNames;

	private final Map<String, JsonData> meta;

	@Nullable
	private final RoutingField routing;

	@Nullable
	private final SourceField source;

	@Nullable
	private final Boolean allowNoIndices;

	@Nullable
	private final Boolean dateDetection;

	@Nullable
	private final DynamicMapping dynamic;

	private final List<String> dynamicDateFormats;

	private final List<NamedValue<DynamicTemplate>> dynamicTemplates;

	private final List<ExpandWildcard> expandWildcards;

	@Nullable
	private final Boolean ignoreUnavailable;

	private final List<String> index;

	@Nullable
	private final Time masterTimeout;

	@Nullable
	private final Boolean numericDetection;

	private final Map<String, Property> properties;

	private final Map<String, RuntimeField> runtime;

	@Nullable
	private final Time timeout;

	@Nullable
	private final Boolean writeIndexOnly;

	// ---------------------------------------------------------------------------------------------

	private PutMappingRequest(Builder builder) {

		this.fieldNames = builder.fieldNames;
		this.meta = ApiTypeHelper.unmodifiable(builder.meta);
		this.routing = builder.routing;
		this.source = builder.source;
		this.allowNoIndices = builder.allowNoIndices;
		this.dateDetection = builder.dateDetection;
		this.dynamic = builder.dynamic;
		this.dynamicDateFormats = ApiTypeHelper.unmodifiable(builder.dynamicDateFormats);
		this.dynamicTemplates = ApiTypeHelper.unmodifiable(builder.dynamicTemplates);
		this.expandWildcards = ApiTypeHelper.unmodifiable(builder.expandWildcards);
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.index = ApiTypeHelper.unmodifiableRequired(builder.index, this, "index");
		this.masterTimeout = builder.masterTimeout;
		this.numericDetection = builder.numericDetection;
		this.properties = ApiTypeHelper.unmodifiable(builder.properties);
		this.runtime = ApiTypeHelper.unmodifiable(builder.runtime);
		this.timeout = builder.timeout;
		this.writeIndexOnly = builder.writeIndexOnly;

	}

	public static PutMappingRequest of(Function<Builder, ObjectBuilder<PutMappingRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Control whether field names are enabled for the index.
	 * <p>
	 * API name: {@code _field_names}
	 */
	@Nullable
	public final FieldNamesField fieldNames() {
		return this.fieldNames;
	}

	/**
	 * A mapping type can have custom meta data associated with it. These are not
	 * used at all by Elasticsearch, but can be used to store application-specific
	 * metadata.
	 * <p>
	 * API name: {@code _meta}
	 */
	public final Map<String, JsonData> meta() {
		return this.meta;
	}

	/**
	 * Enable making a routing value required on indexed documents.
	 * <p>
	 * API name: {@code _routing}
	 */
	@Nullable
	public final RoutingField routing() {
		return this.routing;
	}

	/**
	 * Control whether the _source field is enabled on the index.
	 * <p>
	 * API name: {@code _source}
	 */
	@Nullable
	public final SourceField source() {
		return this.source;
	}

	/**
	 * If <code>false</code>, the request returns an error if any wildcard
	 * expression, index alias, or <code>_all</code> value targets only missing or
	 * closed indices. This behavior applies even if the request targets other open
	 * indices.
	 * <p>
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public final Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * Controls whether dynamic date detection is enabled.
	 * <p>
	 * API name: {@code date_detection}
	 */
	@Nullable
	public final Boolean dateDetection() {
		return this.dateDetection;
	}

	/**
	 * Controls whether new fields are added dynamically.
	 * <p>
	 * API name: {@code dynamic}
	 */
	@Nullable
	public final DynamicMapping dynamic() {
		return this.dynamic;
	}

	/**
	 * If date detection is enabled then new string fields are checked against
	 * 'dynamic_date_formats' and if the value matches then a new date field is
	 * added instead of string.
	 * <p>
	 * API name: {@code dynamic_date_formats}
	 */
	public final List<String> dynamicDateFormats() {
		return this.dynamicDateFormats;
	}

	/**
	 * Specify dynamic templates for the mapping.
	 * <p>
	 * API name: {@code dynamic_templates}
	 */
	public final List<NamedValue<DynamicTemplate>> dynamicTemplates() {
		return this.dynamicTemplates;
	}

	/**
	 * Type of index that wildcard patterns can match. If the request can target
	 * data streams, this argument determines whether wildcard expressions match
	 * hidden data streams. Supports comma-separated values, such as
	 * <code>open,hidden</code>.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	public final List<ExpandWildcard> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * If <code>false</code>, the request returns an error if it targets a missing
	 * or closed index.
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public final Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * Required - A comma-separated list of index names the mapping should be added
	 * to (supports wildcards); use <code>_all</code> or omit to add the mapping on
	 * all indices.
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Automatically map strings into numeric data types for all fields.
	 * <p>
	 * API name: {@code numeric_detection}
	 */
	@Nullable
	public final Boolean numericDetection() {
		return this.numericDetection;
	}

	/**
	 * Mapping for a field. For new fields, this mapping can include:
	 * <ul>
	 * <li>Field name</li>
	 * <li>Field data type</li>
	 * <li>Mapping parameters</li>
	 * </ul>
	 * <p>
	 * API name: {@code properties}
	 */
	public final Map<String, Property> properties() {
		return this.properties;
	}

	/**
	 * Mapping of runtime fields for the index.
	 * <p>
	 * API name: {@code runtime}
	 */
	public final Map<String, RuntimeField> runtime() {
		return this.runtime;
	}

	/**
	 * Period to wait for a response. If no response is received before the timeout
	 * expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * If <code>true</code>, the mappings are applied only to the current write
	 * index for the target.
	 * <p>
	 * API name: {@code write_index_only}
	 */
	@Nullable
	public final Boolean writeIndexOnly() {
		return this.writeIndexOnly;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.fieldNames != null) {
			generator.writeKey("_field_names");
			this.fieldNames.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.meta)) {
			generator.writeKey("_meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.routing != null) {
			generator.writeKey("_routing");
			this.routing.serialize(generator, mapper);

		}
		if (this.source != null) {
			generator.writeKey("_source");
			this.source.serialize(generator, mapper);

		}
		if (this.dateDetection != null) {
			generator.writeKey("date_detection");
			generator.write(this.dateDetection);

		}
		if (this.dynamic != null) {
			generator.writeKey("dynamic");
			this.dynamic.serialize(generator, mapper);
		}
		if (ApiTypeHelper.isDefined(this.dynamicDateFormats)) {
			generator.writeKey("dynamic_date_formats");
			generator.writeStartArray();
			for (String item0 : this.dynamicDateFormats) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.dynamicTemplates)) {
			generator.writeKey("dynamic_templates");
			generator.writeStartArray();
			for (NamedValue<DynamicTemplate> item0 : this.dynamicTemplates) {
				generator.writeStartObject();
				generator.writeKey(item0.name());
				item0.value().serialize(generator, mapper);

				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (this.numericDetection != null) {
			generator.writeKey("numeric_detection");
			generator.write(this.numericDetection);

		}
		if (ApiTypeHelper.isDefined(this.properties)) {
			generator.writeKey("properties");
			generator.writeStartObject();
			for (Map.Entry<String, Property> item0 : this.properties.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.runtime)) {
			generator.writeKey("runtime");
			generator.writeStartObject();
			for (Map.Entry<String, RuntimeField> item0 : this.runtime.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutMappingRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutMappingRequest> {
		@Nullable
		private FieldNamesField fieldNames;

		@Nullable
		private Map<String, JsonData> meta;

		@Nullable
		private RoutingField routing;

		@Nullable
		private SourceField source;

		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private Boolean dateDetection;

		@Nullable
		private DynamicMapping dynamic;

		@Nullable
		private List<String> dynamicDateFormats;

		@Nullable
		private List<NamedValue<DynamicTemplate>> dynamicTemplates;

		@Nullable
		private List<ExpandWildcard> expandWildcards;

		@Nullable
		private Boolean ignoreUnavailable;

		private List<String> index;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private Boolean numericDetection;

		@Nullable
		private Map<String, Property> properties;

		@Nullable
		private Map<String, RuntimeField> runtime;

		@Nullable
		private Time timeout;

		@Nullable
		private Boolean writeIndexOnly;

		/**
		 * Control whether field names are enabled for the index.
		 * <p>
		 * API name: {@code _field_names}
		 */
		public final Builder fieldNames(@Nullable FieldNamesField value) {
			this.fieldNames = value;
			return this;
		}

		/**
		 * Control whether field names are enabled for the index.
		 * <p>
		 * API name: {@code _field_names}
		 */
		public final Builder fieldNames(Function<FieldNamesField.Builder, ObjectBuilder<FieldNamesField>> fn) {
			return this.fieldNames(fn.apply(new FieldNamesField.Builder()).build());
		}

		/**
		 * A mapping type can have custom meta data associated with it. These are not
		 * used at all by Elasticsearch, but can be used to store application-specific
		 * metadata.
		 * <p>
		 * API name: {@code _meta}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>meta</code>.
		 */
		public final Builder meta(Map<String, JsonData> map) {
			this.meta = _mapPutAll(this.meta, map);
			return this;
		}

		/**
		 * A mapping type can have custom meta data associated with it. These are not
		 * used at all by Elasticsearch, but can be used to store application-specific
		 * metadata.
		 * <p>
		 * API name: {@code _meta}
		 * <p>
		 * Adds an entry to <code>meta</code>.
		 */
		public final Builder meta(String key, JsonData value) {
			this.meta = _mapPut(this.meta, key, value);
			return this;
		}

		/**
		 * Enable making a routing value required on indexed documents.
		 * <p>
		 * API name: {@code _routing}
		 */
		public final Builder routing(@Nullable RoutingField value) {
			this.routing = value;
			return this;
		}

		/**
		 * Enable making a routing value required on indexed documents.
		 * <p>
		 * API name: {@code _routing}
		 */
		public final Builder routing(Function<RoutingField.Builder, ObjectBuilder<RoutingField>> fn) {
			return this.routing(fn.apply(new RoutingField.Builder()).build());
		}

		/**
		 * Control whether the _source field is enabled on the index.
		 * <p>
		 * API name: {@code _source}
		 */
		public final Builder source(@Nullable SourceField value) {
			this.source = value;
			return this;
		}

		/**
		 * Control whether the _source field is enabled on the index.
		 * <p>
		 * API name: {@code _source}
		 */
		public final Builder source(Function<SourceField.Builder, ObjectBuilder<SourceField>> fn) {
			return this.source(fn.apply(new SourceField.Builder()).build());
		}

		/**
		 * If <code>false</code>, the request returns an error if any wildcard
		 * expression, index alias, or <code>_all</code> value targets only missing or
		 * closed indices. This behavior applies even if the request targets other open
		 * indices.
		 * <p>
		 * API name: {@code allow_no_indices}
		 */
		public final Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * Controls whether dynamic date detection is enabled.
		 * <p>
		 * API name: {@code date_detection}
		 */
		public final Builder dateDetection(@Nullable Boolean value) {
			this.dateDetection = value;
			return this;
		}

		/**
		 * Controls whether new fields are added dynamically.
		 * <p>
		 * API name: {@code dynamic}
		 */
		public final Builder dynamic(@Nullable DynamicMapping value) {
			this.dynamic = value;
			return this;
		}

		/**
		 * If date detection is enabled then new string fields are checked against
		 * 'dynamic_date_formats' and if the value matches then a new date field is
		 * added instead of string.
		 * <p>
		 * API name: {@code dynamic_date_formats}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>dynamicDateFormats</code>.
		 */
		public final Builder dynamicDateFormats(List<String> list) {
			this.dynamicDateFormats = _listAddAll(this.dynamicDateFormats, list);
			return this;
		}

		/**
		 * If date detection is enabled then new string fields are checked against
		 * 'dynamic_date_formats' and if the value matches then a new date field is
		 * added instead of string.
		 * <p>
		 * API name: {@code dynamic_date_formats}
		 * <p>
		 * Adds one or more values to <code>dynamicDateFormats</code>.
		 */
		public final Builder dynamicDateFormats(String value, String... values) {
			this.dynamicDateFormats = _listAdd(this.dynamicDateFormats, value, values);
			return this;
		}

		/**
		 * Specify dynamic templates for the mapping.
		 * <p>
		 * API name: {@code dynamic_templates}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>dynamicTemplates</code>.
		 */
		public final Builder dynamicTemplates(List<NamedValue<DynamicTemplate>> list) {
			this.dynamicTemplates = _listAddAll(this.dynamicTemplates, list);
			return this;
		}

		/**
		 * Specify dynamic templates for the mapping.
		 * <p>
		 * API name: {@code dynamic_templates}
		 * <p>
		 * Adds one or more values to <code>dynamicTemplates</code>.
		 */
		public final Builder dynamicTemplates(NamedValue<DynamicTemplate> value,
				NamedValue<DynamicTemplate>... values) {
			this.dynamicTemplates = _listAdd(this.dynamicTemplates, value, values);
			return this;
		}

		/**
		 * Type of index that wildcard patterns can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams. Supports comma-separated values, such as
		 * <code>open,hidden</code>.
		 * <p>
		 * API name: {@code expand_wildcards}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>expandWildcards</code>.
		 */
		public final Builder expandWildcards(List<ExpandWildcard> list) {
			this.expandWildcards = _listAddAll(this.expandWildcards, list);
			return this;
		}

		/**
		 * Type of index that wildcard patterns can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams. Supports comma-separated values, such as
		 * <code>open,hidden</code>.
		 * <p>
		 * API name: {@code expand_wildcards}
		 * <p>
		 * Adds one or more values to <code>expandWildcards</code>.
		 */
		public final Builder expandWildcards(ExpandWildcard value, ExpandWildcard... values) {
			this.expandWildcards = _listAdd(this.expandWildcards, value, values);
			return this;
		}

		/**
		 * If <code>false</code>, the request returns an error if it targets a missing
		 * or closed index.
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public final Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * Required - A comma-separated list of index names the mapping should be added
		 * to (supports wildcards); use <code>_all</code> or omit to add the mapping on
		 * all indices.
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>index</code>.
		 */
		public final Builder index(List<String> list) {
			this.index = _listAddAll(this.index, list);
			return this;
		}

		/**
		 * Required - A comma-separated list of index names the mapping should be added
		 * to (supports wildcards); use <code>_all</code> or omit to add the mapping on
		 * all indices.
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds one or more values to <code>index</code>.
		 */
		public final Builder index(String value, String... values) {
			this.index = _listAdd(this.index, value, values);
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Automatically map strings into numeric data types for all fields.
		 * <p>
		 * API name: {@code numeric_detection}
		 */
		public final Builder numericDetection(@Nullable Boolean value) {
			this.numericDetection = value;
			return this;
		}

		/**
		 * Mapping for a field. For new fields, this mapping can include:
		 * <ul>
		 * <li>Field name</li>
		 * <li>Field data type</li>
		 * <li>Mapping parameters</li>
		 * </ul>
		 * <p>
		 * API name: {@code properties}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>properties</code>.
		 */
		public final Builder properties(Map<String, Property> map) {
			this.properties = _mapPutAll(this.properties, map);
			return this;
		}

		/**
		 * Mapping for a field. For new fields, this mapping can include:
		 * <ul>
		 * <li>Field name</li>
		 * <li>Field data type</li>
		 * <li>Mapping parameters</li>
		 * </ul>
		 * <p>
		 * API name: {@code properties}
		 * <p>
		 * Adds an entry to <code>properties</code>.
		 */
		public final Builder properties(String key, Property value) {
			this.properties = _mapPut(this.properties, key, value);
			return this;
		}

		/**
		 * Mapping for a field. For new fields, this mapping can include:
		 * <ul>
		 * <li>Field name</li>
		 * <li>Field data type</li>
		 * <li>Mapping parameters</li>
		 * </ul>
		 * <p>
		 * API name: {@code properties}
		 * <p>
		 * Adds an entry to <code>properties</code> using a builder lambda.
		 */
		public final Builder properties(String key, Function<Property.Builder, ObjectBuilder<Property>> fn) {
			return properties(key, fn.apply(new Property.Builder()).build());
		}

		/**
		 * Mapping of runtime fields for the index.
		 * <p>
		 * API name: {@code runtime}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>runtime</code>.
		 */
		public final Builder runtime(Map<String, RuntimeField> map) {
			this.runtime = _mapPutAll(this.runtime, map);
			return this;
		}

		/**
		 * Mapping of runtime fields for the index.
		 * <p>
		 * API name: {@code runtime}
		 * <p>
		 * Adds an entry to <code>runtime</code>.
		 */
		public final Builder runtime(String key, RuntimeField value) {
			this.runtime = _mapPut(this.runtime, key, value);
			return this;
		}

		/**
		 * Mapping of runtime fields for the index.
		 * <p>
		 * API name: {@code runtime}
		 * <p>
		 * Adds an entry to <code>runtime</code> using a builder lambda.
		 */
		public final Builder runtime(String key, Function<RuntimeField.Builder, ObjectBuilder<RuntimeField>> fn) {
			return runtime(key, fn.apply(new RuntimeField.Builder()).build());
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * If <code>true</code>, the mappings are applied only to the current write
		 * index for the target.
		 * <p>
		 * API name: {@code write_index_only}
		 */
		public final Builder writeIndexOnly(@Nullable Boolean value) {
			this.writeIndexOnly = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutMappingRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutMappingRequest build() {
			_checkSingleUse();

			return new PutMappingRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutMappingRequest}
	 */
	public static final JsonpDeserializer<PutMappingRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutMappingRequest::setupPutMappingRequestDeserializer);

	protected static void setupPutMappingRequestDeserializer(ObjectDeserializer<PutMappingRequest.Builder> op) {

		op.add(Builder::fieldNames, FieldNamesField._DESERIALIZER, "_field_names");
		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "_meta");
		op.add(Builder::routing, RoutingField._DESERIALIZER, "_routing");
		op.add(Builder::source, SourceField._DESERIALIZER, "_source");
		op.add(Builder::dateDetection, JsonpDeserializer.booleanDeserializer(), "date_detection");
		op.add(Builder::dynamic, DynamicMapping._DESERIALIZER, "dynamic");
		op.add(Builder::dynamicDateFormats, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"dynamic_date_formats");
		op.add(Builder::dynamicTemplates,
				JsonpDeserializer.arrayDeserializer(NamedValue.deserializer(() -> DynamicTemplate._DESERIALIZER)),
				"dynamic_templates");
		op.add(Builder::numericDetection, JsonpDeserializer.booleanDeserializer(), "numeric_detection");
		op.add(Builder::properties, JsonpDeserializer.stringMapDeserializer(Property._DESERIALIZER), "properties");
		op.add(Builder::runtime, JsonpDeserializer.stringMapDeserializer(RuntimeField._DESERIALIZER), "runtime");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.put_mapping}".
	 */
	public static final Endpoint<PutMappingRequest, PutMappingResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.put_mapping",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_mapping");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					params.put("index", request.index.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (ApiTypeHelper.isDefined(request.expandWildcards)) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.allowNoIndices != null) {
					params.put("allow_no_indices", String.valueOf(request.allowNoIndices));
				}
				if (request.writeIndexOnly != null) {
					params.put("write_index_only", String.valueOf(request.writeIndexOnly));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutMappingResponse._DESERIALIZER);
}
