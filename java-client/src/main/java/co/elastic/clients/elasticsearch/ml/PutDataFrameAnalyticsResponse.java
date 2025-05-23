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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
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

// typedef: ml.put_data_frame_analytics.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml.put_data_frame_analytics.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutDataFrameAnalyticsResponse implements JsonpSerializable {
	@Nullable
	private final DataframeAnalyticsAuthorization authorization;

	private final boolean allowLazyStart;

	private final DataframeAnalysis analysis;

	@Nullable
	private final DataframeAnalysisAnalyzedFields analyzedFields;

	private final long createTime;

	@Nullable
	private final String description;

	private final DataframeAnalyticsDestination dest;

	private final String id;

	private final int maxNumThreads;

	private final Map<String, JsonData> meta;

	private final String modelMemoryLimit;

	private final DataframeAnalyticsSource source;

	private final String version;

	// ---------------------------------------------------------------------------------------------

	private PutDataFrameAnalyticsResponse(Builder builder) {

		this.authorization = builder.authorization;
		this.allowLazyStart = ApiTypeHelper.requireNonNull(builder.allowLazyStart, this, "allowLazyStart", false);
		this.analysis = ApiTypeHelper.requireNonNull(builder.analysis, this, "analysis");
		this.analyzedFields = builder.analyzedFields;
		this.createTime = ApiTypeHelper.requireNonNull(builder.createTime, this, "createTime", 0);
		this.description = builder.description;
		this.dest = ApiTypeHelper.requireNonNull(builder.dest, this, "dest");
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.maxNumThreads = ApiTypeHelper.requireNonNull(builder.maxNumThreads, this, "maxNumThreads", 0);
		this.meta = ApiTypeHelper.unmodifiable(builder.meta);
		this.modelMemoryLimit = ApiTypeHelper.requireNonNull(builder.modelMemoryLimit, this, "modelMemoryLimit");
		this.source = ApiTypeHelper.requireNonNull(builder.source, this, "source");
		this.version = ApiTypeHelper.requireNonNull(builder.version, this, "version");

	}

	public static PutDataFrameAnalyticsResponse of(Function<Builder, ObjectBuilder<PutDataFrameAnalyticsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code authorization}
	 */
	@Nullable
	public final DataframeAnalyticsAuthorization authorization() {
		return this.authorization;
	}

	/**
	 * Required - API name: {@code allow_lazy_start}
	 */
	public final boolean allowLazyStart() {
		return this.allowLazyStart;
	}

	/**
	 * Required - API name: {@code analysis}
	 */
	public final DataframeAnalysis analysis() {
		return this.analysis;
	}

	/**
	 * API name: {@code analyzed_fields}
	 */
	@Nullable
	public final DataframeAnalysisAnalyzedFields analyzedFields() {
		return this.analyzedFields;
	}

	/**
	 * Required - API name: {@code create_time}
	 */
	public final long createTime() {
		return this.createTime;
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * Required - API name: {@code dest}
	 */
	public final DataframeAnalyticsDestination dest() {
		return this.dest;
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code max_num_threads}
	 */
	public final int maxNumThreads() {
		return this.maxNumThreads;
	}

	/**
	 * API name: {@code _meta}
	 */
	public final Map<String, JsonData> meta() {
		return this.meta;
	}

	/**
	 * Required - API name: {@code model_memory_limit}
	 */
	public final String modelMemoryLimit() {
		return this.modelMemoryLimit;
	}

	/**
	 * Required - API name: {@code source}
	 */
	public final DataframeAnalyticsSource source() {
		return this.source;
	}

	/**
	 * Required - API name: {@code version}
	 */
	public final String version() {
		return this.version;
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

		if (this.authorization != null) {
			generator.writeKey("authorization");
			this.authorization.serialize(generator, mapper);

		}
		generator.writeKey("allow_lazy_start");
		generator.write(this.allowLazyStart);

		generator.writeKey("analysis");
		this.analysis.serialize(generator, mapper);

		if (this.analyzedFields != null) {
			generator.writeKey("analyzed_fields");
			this.analyzedFields.serialize(generator, mapper);

		}
		generator.writeKey("create_time");
		generator.write(this.createTime);

		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		generator.writeKey("dest");
		this.dest.serialize(generator, mapper);

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("max_num_threads");
		generator.write(this.maxNumThreads);

		if (ApiTypeHelper.isDefined(this.meta)) {
			generator.writeKey("_meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("model_memory_limit");
		generator.write(this.modelMemoryLimit);

		generator.writeKey("source");
		this.source.serialize(generator, mapper);

		generator.writeKey("version");
		generator.write(this.version);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutDataFrameAnalyticsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<PutDataFrameAnalyticsResponse> {
		@Nullable
		private DataframeAnalyticsAuthorization authorization;

		private Boolean allowLazyStart;

		private DataframeAnalysis analysis;

		@Nullable
		private DataframeAnalysisAnalyzedFields analyzedFields;

		private Long createTime;

		@Nullable
		private String description;

		private DataframeAnalyticsDestination dest;

		private String id;

		private Integer maxNumThreads;

		@Nullable
		private Map<String, JsonData> meta;

		private String modelMemoryLimit;

		private DataframeAnalyticsSource source;

		private String version;

		/**
		 * API name: {@code authorization}
		 */
		public final Builder authorization(@Nullable DataframeAnalyticsAuthorization value) {
			this.authorization = value;
			return this;
		}

		/**
		 * API name: {@code authorization}
		 */
		public final Builder authorization(
				Function<DataframeAnalyticsAuthorization.Builder, ObjectBuilder<DataframeAnalyticsAuthorization>> fn) {
			return this.authorization(fn.apply(new DataframeAnalyticsAuthorization.Builder()).build());
		}

		/**
		 * Required - API name: {@code allow_lazy_start}
		 */
		public final Builder allowLazyStart(boolean value) {
			this.allowLazyStart = value;
			return this;
		}

		/**
		 * Required - API name: {@code analysis}
		 */
		public final Builder analysis(DataframeAnalysis value) {
			this.analysis = value;
			return this;
		}

		/**
		 * Required - API name: {@code analysis}
		 */
		public final Builder analysis(Function<DataframeAnalysis.Builder, ObjectBuilder<DataframeAnalysis>> fn) {
			return this.analysis(fn.apply(new DataframeAnalysis.Builder()).build());
		}

		/**
		 * Required - API name: {@code analysis}
		 */
		public final Builder analysis(DataframeAnalysisVariant value) {
			this.analysis = value._toDataframeAnalysis();
			return this;
		}

		/**
		 * API name: {@code analyzed_fields}
		 */
		public final Builder analyzedFields(@Nullable DataframeAnalysisAnalyzedFields value) {
			this.analyzedFields = value;
			return this;
		}

		/**
		 * API name: {@code analyzed_fields}
		 */
		public final Builder analyzedFields(
				Function<DataframeAnalysisAnalyzedFields.Builder, ObjectBuilder<DataframeAnalysisAnalyzedFields>> fn) {
			return this.analyzedFields(fn.apply(new DataframeAnalysisAnalyzedFields.Builder()).build());
		}

		/**
		 * Required - API name: {@code create_time}
		 */
		public final Builder createTime(long value) {
			this.createTime = value;
			return this;
		}

		/**
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * Required - API name: {@code dest}
		 */
		public final Builder dest(DataframeAnalyticsDestination value) {
			this.dest = value;
			return this;
		}

		/**
		 * Required - API name: {@code dest}
		 */
		public final Builder dest(
				Function<DataframeAnalyticsDestination.Builder, ObjectBuilder<DataframeAnalyticsDestination>> fn) {
			return this.dest(fn.apply(new DataframeAnalyticsDestination.Builder()).build());
		}

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code max_num_threads}
		 */
		public final Builder maxNumThreads(int value) {
			this.maxNumThreads = value;
			return this;
		}

		/**
		 * API name: {@code _meta}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>meta</code>.
		 */
		public final Builder meta(Map<String, JsonData> map) {
			this.meta = _mapPutAll(this.meta, map);
			return this;
		}

		/**
		 * API name: {@code _meta}
		 * <p>
		 * Adds an entry to <code>meta</code>.
		 */
		public final Builder meta(String key, JsonData value) {
			this.meta = _mapPut(this.meta, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code model_memory_limit}
		 */
		public final Builder modelMemoryLimit(String value) {
			this.modelMemoryLimit = value;
			return this;
		}

		/**
		 * Required - API name: {@code source}
		 */
		public final Builder source(DataframeAnalyticsSource value) {
			this.source = value;
			return this;
		}

		/**
		 * Required - API name: {@code source}
		 */
		public final Builder source(
				Function<DataframeAnalyticsSource.Builder, ObjectBuilder<DataframeAnalyticsSource>> fn) {
			return this.source(fn.apply(new DataframeAnalyticsSource.Builder()).build());
		}

		/**
		 * Required - API name: {@code version}
		 */
		public final Builder version(String value) {
			this.version = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutDataFrameAnalyticsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutDataFrameAnalyticsResponse build() {
			_checkSingleUse();

			return new PutDataFrameAnalyticsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutDataFrameAnalyticsResponse}
	 */
	public static final JsonpDeserializer<PutDataFrameAnalyticsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutDataFrameAnalyticsResponse::setupPutDataFrameAnalyticsResponseDeserializer);

	protected static void setupPutDataFrameAnalyticsResponseDeserializer(
			ObjectDeserializer<PutDataFrameAnalyticsResponse.Builder> op) {

		op.add(Builder::authorization, DataframeAnalyticsAuthorization._DESERIALIZER, "authorization");
		op.add(Builder::allowLazyStart, JsonpDeserializer.booleanDeserializer(), "allow_lazy_start");
		op.add(Builder::analysis, DataframeAnalysis._DESERIALIZER, "analysis");
		op.add(Builder::analyzedFields, DataframeAnalysisAnalyzedFields._DESERIALIZER, "analyzed_fields");
		op.add(Builder::createTime, JsonpDeserializer.longDeserializer(), "create_time");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::dest, DataframeAnalyticsDestination._DESERIALIZER, "dest");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::maxNumThreads, JsonpDeserializer.integerDeserializer(), "max_num_threads");
		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "_meta");
		op.add(Builder::modelMemoryLimit, JsonpDeserializer.stringDeserializer(), "model_memory_limit");
		op.add(Builder::source, DataframeAnalyticsSource._DESERIALIZER, "source");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");

	}

}
