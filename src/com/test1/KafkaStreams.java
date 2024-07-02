package com.test1;

public class KafkaStreams {
	private Integer streamId;
	private String clusterId;
	private String scalableNature;
	private String operableSize;
	private Integer supportedIndicator;
	private Integer standardWriting;
	private Integer externalDependencyCount;
	private String supportedOperatingSystem;
	private String sourceProcessor;
	private String sinkProcessor;
	private String streamDSL;
	private String status;

	public KafkaStreams() {

	}

	public KafkaStreams(Integer streamId, String clusterId, String scalableNature, String operableSize,
			Integer supportedIndicator, Integer standardWriting, Integer externalDependencyCount,
			String supportedOperatingSystem, String sourceProcessor, String sinkProcessor, String streamDSL,
			String status) {
		super();
		this.streamId = streamId;
		this.clusterId = clusterId;
		this.scalableNature = scalableNature;
		this.operableSize = operableSize;
		this.supportedIndicator = supportedIndicator;
		this.standardWriting = standardWriting;
		this.externalDependencyCount = externalDependencyCount;
		this.supportedOperatingSystem = supportedOperatingSystem;
		this.sourceProcessor = sourceProcessor;
		this.sinkProcessor = sinkProcessor;
		this.streamDSL = streamDSL;
		this.status = status;
	}

	public Integer getStreamId() {
		return streamId;
	}

	public void setStreamId(Integer streamId) {
		this.streamId = streamId;
	}

	public String getClusterId() {
		return clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public String getScalableNature() {
		return scalableNature;
	}

	public void setScalableNature(String scalableNature) {
		this.scalableNature = scalableNature;
	}

	public String getOperableSize() {
		return operableSize;
	}

	public void setOperableSize(String operableSize) {
		this.operableSize = operableSize;
	}

	public Integer getSupportedIndicator() {
		return supportedIndicator;
	}

	public void setSupportedIndicator(Integer supportedIndicator) {
		this.supportedIndicator = supportedIndicator;
	}

	public Integer getStandardWriting() {
		return standardWriting;
	}

	public void setStandardWriting(Integer standardWriting) {
		this.standardWriting = standardWriting;
	}

	public Integer getExternalDependencyCount() {
		return externalDependencyCount;
	}

	public void setExternalDependencyCount(Integer externalDependencyCount) {
		this.externalDependencyCount = externalDependencyCount;
	}

	public String getSupportedOperatingSystem() {
		return supportedOperatingSystem;
	}

	public void setSupportedOperatingSystem(String supportedOperatingSystem) {
		this.supportedOperatingSystem = supportedOperatingSystem;
	}

	public String getSourceProcessor() {
		return sourceProcessor;
	}

	public void setSourceProcessor(String sourceProcessor) {
		this.sourceProcessor = sourceProcessor;
	}

	public String getSinkProcessor() {
		return sinkProcessor;
	}

	public void setSinkProcessor(String sinkProcessor) {
		this.sinkProcessor = sinkProcessor;
	}

	public String getStreamDSL() {
		return streamDSL;
	}

	public void setStreamDSL(String streamDSL) {
		this.streamDSL = streamDSL;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
