package com.test1;

public class KafkaMetrics {
	private String metricId;
	private String threadUsage;
	private String verboseLogs;
	private String vmArguments;
	private String stackMemory;
	private String jvmUsage;
	private String controllerStatistics;
	private String replicationCount;
	private String networkDetail;
	private String faultTolerance;

	public KafkaMetrics() {

	}

	public KafkaMetrics(String metricId, String threadUsage, String verboseLogs, String vmArguments, String stackMemory,
			String jvmUsage, String controllerStatistics, String replicationCount, String networkDetail,
			String faultTolerance) {
		super();
		this.metricId = metricId;
		this.threadUsage = threadUsage;
		this.verboseLogs = verboseLogs;
		this.vmArguments = vmArguments;
		this.stackMemory = stackMemory;
		this.jvmUsage = jvmUsage;
		this.controllerStatistics = controllerStatistics;
		this.replicationCount = replicationCount;
		this.networkDetail = networkDetail;
		this.faultTolerance = faultTolerance;
	}

	public String getMetricId() {
		return metricId;
	}

	public void setMetricId(String metricId) {
		this.metricId = metricId;
	}

	public String getThreadUsage() {
		return threadUsage;
	}

	public void setThreadUsage(String threadUsage) {
		this.threadUsage = threadUsage;
	}

	public String getVerboseLogs() {
		return verboseLogs;
	}

	public void setVerboseLogs(String verboseLogs) {
		this.verboseLogs = verboseLogs;
	}

	public String getVmArguments() {
		return vmArguments;
	}

	public void setVmArguments(String vmArguments) {
		this.vmArguments = vmArguments;
	}

	public String getStackMemory() {
		return stackMemory;
	}

	public void setStackMemory(String stackMemory) {
		this.stackMemory = stackMemory;
	}

	public String getJvmUsage() {
		return jvmUsage;
	}

	public void setJvmUsage(String jvmUsage) {
		this.jvmUsage = jvmUsage;
	}

	public String getControllerStatistics() {
		return controllerStatistics;
	}

	public void setControllerStatistics(String controllerStatistics) {
		this.controllerStatistics = controllerStatistics;
	}

	public String getReplicationCount() {
		return replicationCount;
	}

	public void setReplicationCount(String replicationCount) {
		this.replicationCount = replicationCount;
	}

	public String getNetworkDetail() {
		return networkDetail;
	}

	public void setNetworkDetail(String networkDetail) {
		this.networkDetail = networkDetail;
	}

	public String getFaultTolerance() {
		return faultTolerance;
	}

	public void setFaultTolerance(String faultTolerance) {
		this.faultTolerance = faultTolerance;
	}

}
