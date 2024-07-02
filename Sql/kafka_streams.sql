create table if not exists kafka_streams(
stream_id Integer not null,
cluster_id varchar(255) null,
scalable_nature varchar(255) null,
operable_size varchar(255) null,
supported_indicator Integer null,
standard_writing Integer null,
external_dependency_count Integer null,
supported_operating_system varchar(255) null,
source_processor varchar(255) null,
sink_processor varchar(255) null,
stream_dsl varchar(255) null,
status varchar(255) null,
constraint kafka_streams_pk primary key(stream_id));