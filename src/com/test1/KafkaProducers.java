package com.test1;

public class KafkaProducers {
	private Integer clusterId;
	private Integer producerType;
	private String dataType;
	private String dataIsolation;
	private String dataFilter;
	private String singleCluster;
	private String multiCluster;
	private String singleDatacenter;
	private String multiDataCenter;
	private String mirrorMaker;
	private String clusterAggregate;
	private String endPoint;
	private String vpnDetails;
	private String directConnect;

	public KafkaProducers() {

	}

	public KafkaProducers(Integer clusterId, Integer producerType, String dataType, String dataIsolation,
			String dataFilter, String singleCluster, String multiCluster, String singleDatacenter,
			String multiDataCenter, String mirrorMaker, String clusterAggregate, String endPoint, String vpnDetails,
			String directConnect) {
		super();
		this.clusterId = clusterId;
		this.producerType = producerType;
		this.dataType = dataType;
		this.dataIsolation = dataIsolation;
		this.dataFilter = dataFilter;
		this.singleCluster = singleCluster;
		this.multiCluster = multiCluster;
		this.singleDatacenter = singleDatacenter;
		this.multiDataCenter = multiDataCenter;
		this.mirrorMaker = mirrorMaker;
		this.clusterAggregate = clusterAggregate;
		this.endPoint = endPoint;
		this.vpnDetails = vpnDetails;
		this.directConnect = directConnect;
	}

	public Integer getClusterId() {
		return clusterId;
	}

	public void setClusterId(Integer clusterId) {
		this.clusterId = clusterId;
	}

	public Integer getProducerType() {
		return producerType;
	}

	public void setProducerType(Integer producerType) {
		this.producerType = producerType;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getDataIsolation() {
		return dataIsolation;
	}

	public void setDataIsolation(String dataIsolation) {
		this.dataIsolation = dataIsolation;
	}

	public String getDataFilter() {
		return dataFilter;
	}

	public void setDataFilter(String dataFilter) {
		this.dataFilter = dataFilter;
	}

	public String getSingleCluster() {
		return singleCluster;
	}

	public void setSingleCluster(String singleCluster) {
		this.singleCluster = singleCluster;
	}

	public String getMultiCluster() {
		return multiCluster;
	}

	public void setMultiCluster(String multiCluster) {
		this.multiCluster = multiCluster;
	}

	public String getSingleDatacenter() {
		return singleDatacenter;
	}

	public void setSingleDatacenter(String singleDatacenter) {
		this.singleDatacenter = singleDatacenter;
	}

	public String getMultiDataCenter() {
		return multiDataCenter;
	}

	public void setMultiDataCenter(String multiDataCenter) {
		this.multiDataCenter = multiDataCenter;
	}

	public String getMirrorMaker() {
		return mirrorMaker;
	}

	public void setMirrorMaker(String mirrorMaker) {
		this.mirrorMaker = mirrorMaker;
	}

	public String getClusterAggregate() {
		return clusterAggregate;
	}

	public void setClusterAggregate(String clusterAggregate) {
		this.clusterAggregate = clusterAggregate;
	}

	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}

	public String getVpnDetails() {
		return vpnDetails;
	}

	public void setVpnDetails(String vpnDetails) {
		this.vpnDetails = vpnDetails;
	}

	public String getDirectConnect() {
		return directConnect;
	}

	public void setDirectConnect(String directConnect) {
		this.directConnect = directConnect;
	}

}
