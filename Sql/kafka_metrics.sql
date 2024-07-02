create table if not exists kafka_metrics(
metric_id varchar(255) not null,
thread_usage varchar(255) null,
verbose_logs varchar(255) null,
vm_arguments varchar(255) null,
stack_memory varchar(255) null,
jvm_usage varchar(255) null,
controller_statistics varchar(255) null,
replication_count varchar(255) null,
network_detail varchar(255) null,
fault_tolerance varchar(255) null,
constraint kafka_metrics_pk primary key(metric_id));