package com.test1;

public class KafkaCluster {
	private Integer systemId;
	private String distributedIndicator;
	private boolean bigData;
	private Integer replicationFactor;
	private String numberOfCopies;
	private String totalTopics;
	private String partitionCount;
	private String synchronizeData;
	private String inSyncReplica;
	private Integer zookeeperIpAddress;
	private String zookeeperHost;
	private String zookeeperPort;
	private String leader;

	public KafkaCluster() {

	}

	public KafkaCluster(Integer systemId, String distributedIndicator, boolean bigData, Integer replicationFactor,
			String numberOfCopies, String totalTopics, String partitionCount, String synchronizeData,
			String inSyncReplica, Integer zookeeperIpAddress, String zookeeperHost, String zookeeperPort,
			String leader) {
		super();
		this.systemId = systemId;
		this.distributedIndicator = distributedIndicator;
		this.bigData = bigData;
		this.replicationFactor = replicationFactor;
		this.numberOfCopies = numberOfCopies;
		this.totalTopics = totalTopics;
		this.partitionCount = partitionCount;
		this.synchronizeData = synchronizeData;
		this.inSyncReplica = inSyncReplica;
		this.zookeeperIpAddress = zookeeperIpAddress;
		this.zookeeperHost = zookeeperHost;
		this.zookeeperPort = zookeeperPort;
		this.leader = leader;
	}

	public Integer getSystemId() {
		return systemId;
	}

	public void setSystemId(Integer systemId) {
		this.systemId = systemId;
	}

	public String getDistributedIndicator() {
		return distributedIndicator;
	}

	public void setDistributedIndicator(String distributedIndicator) {
		this.distributedIndicator = distributedIndicator;
	}

	public boolean isBigData() {
		return bigData;
	}

	public void setBigData(boolean bigData) {
		this.bigData = bigData;
	}

	public Integer getReplicationFactor() {
		return replicationFactor;
	}

	public void setReplicationFactor(Integer replicationFactor) {
		this.replicationFactor = replicationFactor;
	}

	public String getNumberOfCopies() {
		return numberOfCopies;
	}

	public void setNumberOfCopies(String numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}

	public String getTotalTopics() {
		return totalTopics;
	}

	public void setTotalTopics(String totalTopics) {
		this.totalTopics = totalTopics;
	}

	public String getPartitionCount() {
		return partitionCount;
	}

	public void setPartitionCount(String partitionCount) {
		this.partitionCount = partitionCount;
	}

	public String getSynchronizeData() {
		return synchronizeData;
	}

	public void setSynchronizeData(String synchronizeData) {
		this.synchronizeData = synchronizeData;
	}

	public String getInSyncReplica() {
		return inSyncReplica;
	}

	public void setInSyncReplica(String inSyncReplica) {
		this.inSyncReplica = inSyncReplica;
	}

	public Integer getZookeeperIpAddress() {
		return zookeeperIpAddress;
	}

	public void setZookeeperIpAddress(Integer zookeeperIpAddress) {
		this.zookeeperIpAddress = zookeeperIpAddress;
	}

	public String getZookeeperHost() {
		return zookeeperHost;
	}

	public void setZookeeperHost(String zookeeperHost) {
		this.zookeeperHost = zookeeperHost;
	}

	public String getZookeeperPort() {
		return zookeeperPort;
	}

	public void setZookeeperPort(String zookeeperPort) {
		this.zookeeperPort = zookeeperPort;
	}

	public String getLeader() {
		return leader;
	}

	public void setLeader(String leader) {
		this.leader = leader;
	}

}
