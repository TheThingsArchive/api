/* Generated by the protocol buffer compiler.  DO NOT EDIT! */
/* Generated from: github.com/TheThingsNetwork/api/api.proto */

/* Do not generate deprecated warnings for self */
#ifndef PROTOBUF_C__NO_DEPRECATED
#define PROTOBUF_C__NO_DEPRECATED
#endif

#include "github.com/TheThingsNetwork/api/api.pb-c.h"
void   api__percentiles__init
                     (Api__Percentiles         *message)
{
  static const Api__Percentiles init_value = API__PERCENTILES__INIT;
  *message = init_value;
}
size_t api__percentiles__get_packed_size
                     (const Api__Percentiles *message)
{
  assert(message->base.descriptor == &api__percentiles__descriptor);
  return protobuf_c_message_get_packed_size ((const ProtobufCMessage*)(message));
}
size_t api__percentiles__pack
                     (const Api__Percentiles *message,
                      uint8_t       *out)
{
  assert(message->base.descriptor == &api__percentiles__descriptor);
  return protobuf_c_message_pack ((const ProtobufCMessage*)message, out);
}
size_t api__percentiles__pack_to_buffer
                     (const Api__Percentiles *message,
                      ProtobufCBuffer *buffer)
{
  assert(message->base.descriptor == &api__percentiles__descriptor);
  return protobuf_c_message_pack_to_buffer ((const ProtobufCMessage*)message, buffer);
}
Api__Percentiles *
       api__percentiles__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data)
{
  return (Api__Percentiles *)
     protobuf_c_message_unpack (&api__percentiles__descriptor,
                                allocator, len, data);
}
void   api__percentiles__free_unpacked
                     (Api__Percentiles *message,
                      ProtobufCAllocator *allocator)
{
  if(!message)
    return;
  assert(message->base.descriptor == &api__percentiles__descriptor);
  protobuf_c_message_free_unpacked ((ProtobufCMessage*)message, allocator);
}
void   api__rates__init
                     (Api__Rates         *message)
{
  static const Api__Rates init_value = API__RATES__INIT;
  *message = init_value;
}
size_t api__rates__get_packed_size
                     (const Api__Rates *message)
{
  assert(message->base.descriptor == &api__rates__descriptor);
  return protobuf_c_message_get_packed_size ((const ProtobufCMessage*)(message));
}
size_t api__rates__pack
                     (const Api__Rates *message,
                      uint8_t       *out)
{
  assert(message->base.descriptor == &api__rates__descriptor);
  return protobuf_c_message_pack ((const ProtobufCMessage*)message, out);
}
size_t api__rates__pack_to_buffer
                     (const Api__Rates *message,
                      ProtobufCBuffer *buffer)
{
  assert(message->base.descriptor == &api__rates__descriptor);
  return protobuf_c_message_pack_to_buffer ((const ProtobufCMessage*)message, buffer);
}
Api__Rates *
       api__rates__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data)
{
  return (Api__Rates *)
     protobuf_c_message_unpack (&api__rates__descriptor,
                                allocator, len, data);
}
void   api__rates__free_unpacked
                     (Api__Rates *message,
                      ProtobufCAllocator *allocator)
{
  if(!message)
    return;
  assert(message->base.descriptor == &api__rates__descriptor);
  protobuf_c_message_free_unpacked ((ProtobufCMessage*)message, allocator);
}
void   api__system_stats__loadstats__init
                     (Api__SystemStats__Loadstats         *message)
{
  static const Api__SystemStats__Loadstats init_value = API__SYSTEM_STATS__LOADSTATS__INIT;
  *message = init_value;
}
void   api__system_stats__cpustats__init
                     (Api__SystemStats__CPUStats         *message)
{
  static const Api__SystemStats__CPUStats init_value = API__SYSTEM_STATS__CPUSTATS__INIT;
  *message = init_value;
}
void   api__system_stats__memory_stats__init
                     (Api__SystemStats__MemoryStats         *message)
{
  static const Api__SystemStats__MemoryStats init_value = API__SYSTEM_STATS__MEMORY_STATS__INIT;
  *message = init_value;
}
void   api__system_stats__init
                     (Api__SystemStats         *message)
{
  static const Api__SystemStats init_value = API__SYSTEM_STATS__INIT;
  *message = init_value;
}
size_t api__system_stats__get_packed_size
                     (const Api__SystemStats *message)
{
  assert(message->base.descriptor == &api__system_stats__descriptor);
  return protobuf_c_message_get_packed_size ((const ProtobufCMessage*)(message));
}
size_t api__system_stats__pack
                     (const Api__SystemStats *message,
                      uint8_t       *out)
{
  assert(message->base.descriptor == &api__system_stats__descriptor);
  return protobuf_c_message_pack ((const ProtobufCMessage*)message, out);
}
size_t api__system_stats__pack_to_buffer
                     (const Api__SystemStats *message,
                      ProtobufCBuffer *buffer)
{
  assert(message->base.descriptor == &api__system_stats__descriptor);
  return protobuf_c_message_pack_to_buffer ((const ProtobufCMessage*)message, buffer);
}
Api__SystemStats *
       api__system_stats__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data)
{
  return (Api__SystemStats *)
     protobuf_c_message_unpack (&api__system_stats__descriptor,
                                allocator, len, data);
}
void   api__system_stats__free_unpacked
                     (Api__SystemStats *message,
                      ProtobufCAllocator *allocator)
{
  if(!message)
    return;
  assert(message->base.descriptor == &api__system_stats__descriptor);
  protobuf_c_message_free_unpacked ((ProtobufCMessage*)message, allocator);
}
void   api__component_stats__cpustats__init
                     (Api__ComponentStats__CPUStats         *message)
{
  static const Api__ComponentStats__CPUStats init_value = API__COMPONENT_STATS__CPUSTATS__INIT;
  *message = init_value;
}
void   api__component_stats__memory_stats__init
                     (Api__ComponentStats__MemoryStats         *message)
{
  static const Api__ComponentStats__MemoryStats init_value = API__COMPONENT_STATS__MEMORY_STATS__INIT;
  *message = init_value;
}
void   api__component_stats__init
                     (Api__ComponentStats         *message)
{
  static const Api__ComponentStats init_value = API__COMPONENT_STATS__INIT;
  *message = init_value;
}
size_t api__component_stats__get_packed_size
                     (const Api__ComponentStats *message)
{
  assert(message->base.descriptor == &api__component_stats__descriptor);
  return protobuf_c_message_get_packed_size ((const ProtobufCMessage*)(message));
}
size_t api__component_stats__pack
                     (const Api__ComponentStats *message,
                      uint8_t       *out)
{
  assert(message->base.descriptor == &api__component_stats__descriptor);
  return protobuf_c_message_pack ((const ProtobufCMessage*)message, out);
}
size_t api__component_stats__pack_to_buffer
                     (const Api__ComponentStats *message,
                      ProtobufCBuffer *buffer)
{
  assert(message->base.descriptor == &api__component_stats__descriptor);
  return protobuf_c_message_pack_to_buffer ((const ProtobufCMessage*)message, buffer);
}
Api__ComponentStats *
       api__component_stats__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data)
{
  return (Api__ComponentStats *)
     protobuf_c_message_unpack (&api__component_stats__descriptor,
                                allocator, len, data);
}
void   api__component_stats__free_unpacked
                     (Api__ComponentStats *message,
                      ProtobufCAllocator *allocator)
{
  if(!message)
    return;
  assert(message->base.descriptor == &api__component_stats__descriptor);
  protobuf_c_message_free_unpacked ((ProtobufCMessage*)message, allocator);
}
static const ProtobufCFieldDescriptor api__percentiles__field_descriptors[9] =
{
  {
    "percentile1",
    1,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Api__Percentiles, percentile1),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "percentile5",
    2,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Api__Percentiles, percentile5),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "percentile10",
    3,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Api__Percentiles, percentile10),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "percentile25",
    4,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Api__Percentiles, percentile25),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "percentile50",
    5,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Api__Percentiles, percentile50),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "percentile75",
    6,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Api__Percentiles, percentile75),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "percentile90",
    7,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Api__Percentiles, percentile90),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "percentile95",
    8,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Api__Percentiles, percentile95),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "percentile99",
    9,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Api__Percentiles, percentile99),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
};
static const unsigned api__percentiles__field_indices_by_name[] = {
  0,   /* field[0] = percentile1 */
  2,   /* field[2] = percentile10 */
  3,   /* field[3] = percentile25 */
  1,   /* field[1] = percentile5 */
  4,   /* field[4] = percentile50 */
  5,   /* field[5] = percentile75 */
  6,   /* field[6] = percentile90 */
  7,   /* field[7] = percentile95 */
  8,   /* field[8] = percentile99 */
};
static const ProtobufCIntRange api__percentiles__number_ranges[1 + 1] =
{
  { 1, 0 },
  { 0, 9 }
};
const ProtobufCMessageDescriptor api__percentiles__descriptor =
{
  PROTOBUF_C__MESSAGE_DESCRIPTOR_MAGIC,
  "api.Percentiles",
  "Percentiles",
  "Api__Percentiles",
  "api",
  sizeof(Api__Percentiles),
  9,
  api__percentiles__field_descriptors,
  api__percentiles__field_indices_by_name,
  1,  api__percentiles__number_ranges,
  (ProtobufCMessageInit) api__percentiles__init,
  NULL,NULL,NULL    /* reserved[123] */
};
static const ProtobufCFieldDescriptor api__rates__field_descriptors[3] =
{
  {
    "rate1",
    1,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Api__Rates, rate1),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "rate5",
    2,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Api__Rates, rate5),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "rate15",
    3,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Api__Rates, rate15),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
};
static const unsigned api__rates__field_indices_by_name[] = {
  0,   /* field[0] = rate1 */
  2,   /* field[2] = rate15 */
  1,   /* field[1] = rate5 */
};
static const ProtobufCIntRange api__rates__number_ranges[1 + 1] =
{
  { 1, 0 },
  { 0, 3 }
};
const ProtobufCMessageDescriptor api__rates__descriptor =
{
  PROTOBUF_C__MESSAGE_DESCRIPTOR_MAGIC,
  "api.Rates",
  "Rates",
  "Api__Rates",
  "api",
  sizeof(Api__Rates),
  3,
  api__rates__field_descriptors,
  api__rates__field_indices_by_name,
  1,  api__rates__number_ranges,
  (ProtobufCMessageInit) api__rates__init,
  NULL,NULL,NULL    /* reserved[123] */
};
static const ProtobufCFieldDescriptor api__system_stats__loadstats__field_descriptors[3] =
{
  {
    "load1",
    1,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Api__SystemStats__Loadstats, load1),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "load5",
    2,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Api__SystemStats__Loadstats, load5),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "load15",
    3,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Api__SystemStats__Loadstats, load15),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
};
static const unsigned api__system_stats__loadstats__field_indices_by_name[] = {
  0,   /* field[0] = load1 */
  2,   /* field[2] = load15 */
  1,   /* field[1] = load5 */
};
static const ProtobufCIntRange api__system_stats__loadstats__number_ranges[1 + 1] =
{
  { 1, 0 },
  { 0, 3 }
};
const ProtobufCMessageDescriptor api__system_stats__loadstats__descriptor =
{
  PROTOBUF_C__MESSAGE_DESCRIPTOR_MAGIC,
  "api.SystemStats.Loadstats",
  "Loadstats",
  "Api__SystemStats__Loadstats",
  "api",
  sizeof(Api__SystemStats__Loadstats),
  3,
  api__system_stats__loadstats__field_descriptors,
  api__system_stats__loadstats__field_indices_by_name,
  1,  api__system_stats__loadstats__number_ranges,
  (ProtobufCMessageInit) api__system_stats__loadstats__init,
  NULL,NULL,NULL    /* reserved[123] */
};
static const ProtobufCFieldDescriptor api__system_stats__cpustats__field_descriptors[4] =
{
  {
    "user",
    1,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Api__SystemStats__CPUStats, user),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "system",
    2,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Api__SystemStats__CPUStats, system),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "idle",
    3,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Api__SystemStats__CPUStats, idle),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "percentage",
    4,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Api__SystemStats__CPUStats, percentage),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
};
static const unsigned api__system_stats__cpustats__field_indices_by_name[] = {
  2,   /* field[2] = idle */
  3,   /* field[3] = percentage */
  1,   /* field[1] = system */
  0,   /* field[0] = user */
};
static const ProtobufCIntRange api__system_stats__cpustats__number_ranges[1 + 1] =
{
  { 1, 0 },
  { 0, 4 }
};
const ProtobufCMessageDescriptor api__system_stats__cpustats__descriptor =
{
  PROTOBUF_C__MESSAGE_DESCRIPTOR_MAGIC,
  "api.SystemStats.CPUStats",
  "CPUStats",
  "Api__SystemStats__CPUStats",
  "api",
  sizeof(Api__SystemStats__CPUStats),
  4,
  api__system_stats__cpustats__field_descriptors,
  api__system_stats__cpustats__field_indices_by_name,
  1,  api__system_stats__cpustats__number_ranges,
  (ProtobufCMessageInit) api__system_stats__cpustats__init,
  NULL,NULL,NULL    /* reserved[123] */
};
static const ProtobufCFieldDescriptor api__system_stats__memory_stats__field_descriptors[3] =
{
  {
    "total",
    1,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT64,
    0,   /* quantifier_offset */
    offsetof(Api__SystemStats__MemoryStats, total),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "available",
    2,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT64,
    0,   /* quantifier_offset */
    offsetof(Api__SystemStats__MemoryStats, available),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "used",
    3,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT64,
    0,   /* quantifier_offset */
    offsetof(Api__SystemStats__MemoryStats, used),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
};
static const unsigned api__system_stats__memory_stats__field_indices_by_name[] = {
  1,   /* field[1] = available */
  0,   /* field[0] = total */
  2,   /* field[2] = used */
};
static const ProtobufCIntRange api__system_stats__memory_stats__number_ranges[1 + 1] =
{
  { 1, 0 },
  { 0, 3 }
};
const ProtobufCMessageDescriptor api__system_stats__memory_stats__descriptor =
{
  PROTOBUF_C__MESSAGE_DESCRIPTOR_MAGIC,
  "api.SystemStats.MemoryStats",
  "MemoryStats",
  "Api__SystemStats__MemoryStats",
  "api",
  sizeof(Api__SystemStats__MemoryStats),
  3,
  api__system_stats__memory_stats__field_descriptors,
  api__system_stats__memory_stats__field_indices_by_name,
  1,  api__system_stats__memory_stats__number_ranges,
  (ProtobufCMessageInit) api__system_stats__memory_stats__init,
  NULL,NULL,NULL    /* reserved[123] */
};
static const ProtobufCFieldDescriptor api__system_stats__field_descriptors[3] =
{
  {
    "load",
    1,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_MESSAGE,
    0,   /* quantifier_offset */
    offsetof(Api__SystemStats, load),
    &api__system_stats__loadstats__descriptor,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "cpu",
    2,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_MESSAGE,
    0,   /* quantifier_offset */
    offsetof(Api__SystemStats, cpu),
    &api__system_stats__cpustats__descriptor,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "memory",
    3,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_MESSAGE,
    0,   /* quantifier_offset */
    offsetof(Api__SystemStats, memory),
    &api__system_stats__memory_stats__descriptor,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
};
static const unsigned api__system_stats__field_indices_by_name[] = {
  1,   /* field[1] = cpu */
  0,   /* field[0] = load */
  2,   /* field[2] = memory */
};
static const ProtobufCIntRange api__system_stats__number_ranges[1 + 1] =
{
  { 1, 0 },
  { 0, 3 }
};
const ProtobufCMessageDescriptor api__system_stats__descriptor =
{
  PROTOBUF_C__MESSAGE_DESCRIPTOR_MAGIC,
  "api.SystemStats",
  "SystemStats",
  "Api__SystemStats",
  "api",
  sizeof(Api__SystemStats),
  3,
  api__system_stats__field_descriptors,
  api__system_stats__field_indices_by_name,
  1,  api__system_stats__number_ranges,
  (ProtobufCMessageInit) api__system_stats__init,
  NULL,NULL,NULL    /* reserved[123] */
};
static const ProtobufCFieldDescriptor api__component_stats__cpustats__field_descriptors[4] =
{
  {
    "user",
    1,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Api__ComponentStats__CPUStats, user),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "system",
    2,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Api__ComponentStats__CPUStats, system),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "idle",
    3,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Api__ComponentStats__CPUStats, idle),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "percentage",
    4,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Api__ComponentStats__CPUStats, percentage),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
};
static const unsigned api__component_stats__cpustats__field_indices_by_name[] = {
  2,   /* field[2] = idle */
  3,   /* field[3] = percentage */
  1,   /* field[1] = system */
  0,   /* field[0] = user */
};
static const ProtobufCIntRange api__component_stats__cpustats__number_ranges[1 + 1] =
{
  { 1, 0 },
  { 0, 4 }
};
const ProtobufCMessageDescriptor api__component_stats__cpustats__descriptor =
{
  PROTOBUF_C__MESSAGE_DESCRIPTOR_MAGIC,
  "api.ComponentStats.CPUStats",
  "CPUStats",
  "Api__ComponentStats__CPUStats",
  "api",
  sizeof(Api__ComponentStats__CPUStats),
  4,
  api__component_stats__cpustats__field_descriptors,
  api__component_stats__cpustats__field_indices_by_name,
  1,  api__component_stats__cpustats__number_ranges,
  (ProtobufCMessageInit) api__component_stats__cpustats__init,
  NULL,NULL,NULL    /* reserved[123] */
};
static const ProtobufCFieldDescriptor api__component_stats__memory_stats__field_descriptors[4] =
{
  {
    "memory",
    1,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT64,
    0,   /* quantifier_offset */
    offsetof(Api__ComponentStats__MemoryStats, memory),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "swap",
    2,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT64,
    0,   /* quantifier_offset */
    offsetof(Api__ComponentStats__MemoryStats, swap),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "heap",
    10,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT64,
    0,   /* quantifier_offset */
    offsetof(Api__ComponentStats__MemoryStats, heap),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "stack",
    11,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT64,
    0,   /* quantifier_offset */
    offsetof(Api__ComponentStats__MemoryStats, stack),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
};
static const unsigned api__component_stats__memory_stats__field_indices_by_name[] = {
  2,   /* field[2] = heap */
  0,   /* field[0] = memory */
  3,   /* field[3] = stack */
  1,   /* field[1] = swap */
};
static const ProtobufCIntRange api__component_stats__memory_stats__number_ranges[2 + 1] =
{
  { 1, 0 },
  { 10, 2 },
  { 0, 4 }
};
const ProtobufCMessageDescriptor api__component_stats__memory_stats__descriptor =
{
  PROTOBUF_C__MESSAGE_DESCRIPTOR_MAGIC,
  "api.ComponentStats.MemoryStats",
  "MemoryStats",
  "Api__ComponentStats__MemoryStats",
  "api",
  sizeof(Api__ComponentStats__MemoryStats),
  4,
  api__component_stats__memory_stats__field_descriptors,
  api__component_stats__memory_stats__field_indices_by_name,
  2,  api__component_stats__memory_stats__number_ranges,
  (ProtobufCMessageInit) api__component_stats__memory_stats__init,
  NULL,NULL,NULL    /* reserved[123] */
};
static const ProtobufCFieldDescriptor api__component_stats__field_descriptors[5] =
{
  {
    "uptime",
    1,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT64,
    0,   /* quantifier_offset */
    offsetof(Api__ComponentStats, uptime),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "cpu",
    2,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_MESSAGE,
    0,   /* quantifier_offset */
    offsetof(Api__ComponentStats, cpu),
    &api__component_stats__cpustats__descriptor,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "memory",
    3,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_MESSAGE,
    0,   /* quantifier_offset */
    offsetof(Api__ComponentStats, memory),
    &api__component_stats__memory_stats__descriptor,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "goroutines",
    4,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT64,
    0,   /* quantifier_offset */
    offsetof(Api__ComponentStats, goroutines),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "gc_cpu_fraction",
    5,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Api__ComponentStats, gc_cpu_fraction),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
};
static const unsigned api__component_stats__field_indices_by_name[] = {
  1,   /* field[1] = cpu */
  4,   /* field[4] = gc_cpu_fraction */
  3,   /* field[3] = goroutines */
  2,   /* field[2] = memory */
  0,   /* field[0] = uptime */
};
static const ProtobufCIntRange api__component_stats__number_ranges[1 + 1] =
{
  { 1, 0 },
  { 0, 5 }
};
const ProtobufCMessageDescriptor api__component_stats__descriptor =
{
  PROTOBUF_C__MESSAGE_DESCRIPTOR_MAGIC,
  "api.ComponentStats",
  "ComponentStats",
  "Api__ComponentStats",
  "api",
  sizeof(Api__ComponentStats),
  5,
  api__component_stats__field_descriptors,
  api__component_stats__field_indices_by_name,
  1,  api__component_stats__number_ranges,
  (ProtobufCMessageInit) api__component_stats__init,
  NULL,NULL,NULL    /* reserved[123] */
};
