/* Generated by the protocol buffer compiler.  DO NOT EDIT! */
/* Generated from: github.com/TheThingsNetwork/api/broker/broker.proto */

#ifndef PROTOBUF_C_github_2ecom_2fTheThingsNetwork_2fapi_2fbroker_2fbroker_2eproto__INCLUDED
#define PROTOBUF_C_github_2ecom_2fTheThingsNetwork_2fapi_2fbroker_2fbroker_2eproto__INCLUDED

#include <protobuf-c/protobuf-c.h>

PROTOBUF_C__BEGIN_DECLS

#if PROTOBUF_C_VERSION_NUMBER < 1003000
# error This file was generated by a newer version of protoc-c which is incompatible with your libprotobuf-c headers. Please update your headers.
#elif 1003001 < PROTOBUF_C_MIN_COMPILER_VERSION
# error This file was generated by an older version of protoc-c which is incompatible with your libprotobuf-c headers. Please regenerate this file with a newer version of protoc-c.
#endif

#include "google/protobuf/empty.pb-c.h"
#include "github.com/gogo/protobuf/gogoproto/gogo.pb-c.h"
#include "github.com/TheThingsNetwork/api/api.pb-c.h"
#include "github.com/TheThingsNetwork/api/protocol/protocol.pb-c.h"
#include "github.com/TheThingsNetwork/api/gateway/gateway.pb-c.h"
#include "github.com/TheThingsNetwork/api/trace/trace.pb-c.h"

typedef struct _Broker__DownlinkOption Broker__DownlinkOption;
typedef struct _Broker__UplinkMessage Broker__UplinkMessage;
typedef struct _Broker__DownlinkMessage Broker__DownlinkMessage;
typedef struct _Broker__DeviceActivationResponse Broker__DeviceActivationResponse;
typedef struct _Broker__DeduplicatedUplinkMessage Broker__DeduplicatedUplinkMessage;
typedef struct _Broker__DeviceActivationRequest Broker__DeviceActivationRequest;
typedef struct _Broker__DeduplicatedDeviceActivationRequest Broker__DeduplicatedDeviceActivationRequest;
typedef struct _Broker__ActivationChallengeRequest Broker__ActivationChallengeRequest;
typedef struct _Broker__ActivationChallengeResponse Broker__ActivationChallengeResponse;
typedef struct _Broker__SubscribeRequest Broker__SubscribeRequest;
typedef struct _Broker__StatusRequest Broker__StatusRequest;
typedef struct _Broker__Status Broker__Status;
typedef struct _Broker__ApplicationHandlerRegistration Broker__ApplicationHandlerRegistration;


/* --- enums --- */


/* --- messages --- */

struct  _Broker__DownlinkOption
{
  ProtobufCMessage base;
  /*
   * String that identifies this downlink option in the Router
   */
  char *identifier;
  /*
   * ID of the gateway where this downlink should be sent
   */
  char *gateway_id;
  /*
   * Score of this downlink option. Lower is better.
   */
  uint32_t score;
  /*
   * deadline time at server represented as Unix nanoseconds
   */
  int64_t deadline;
  Protocol__TxConfiguration *protocol_configuration;
  Gateway__TxConfiguration *gateway_configuration;
};
#define BROKER__DOWNLINK_OPTION__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&broker__downlink_option__descriptor) \
    , (char *)protobuf_c_empty_string, (char *)protobuf_c_empty_string, 0, 0, NULL, NULL }


/*
 * received from the Router
 */
struct  _Broker__UplinkMessage
{
  ProtobufCMessage base;
  ProtobufCBinaryData payload;
  Protocol__Message *message;
  ProtobufCBinaryData dev_eui;
  ProtobufCBinaryData app_eui;
  char *app_id;
  char *dev_id;
  Protocol__RxMetadata *protocol_metadata;
  Gateway__RxMetadata *gateway_metadata;
  size_t n_downlink_options;
  Broker__DownlinkOption **downlink_options;
  Trace__Trace *trace;
};
#define BROKER__UPLINK_MESSAGE__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&broker__uplink_message__descriptor) \
    , {0,NULL}, NULL, {0,NULL}, {0,NULL}, (char *)protobuf_c_empty_string, (char *)protobuf_c_empty_string, NULL, NULL, 0,NULL, NULL }


/*
 * received from the Handler, sent to the Router, used as Template
 */
struct  _Broker__DownlinkMessage
{
  ProtobufCMessage base;
  ProtobufCBinaryData payload;
  Protocol__Message *message;
  ProtobufCBinaryData dev_eui;
  ProtobufCBinaryData app_eui;
  char *app_id;
  char *dev_id;
  Broker__DownlinkOption *downlink_option;
  Trace__Trace *trace;
};
#define BROKER__DOWNLINK_MESSAGE__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&broker__downlink_message__descriptor) \
    , {0,NULL}, NULL, {0,NULL}, {0,NULL}, (char *)protobuf_c_empty_string, (char *)protobuf_c_empty_string, NULL, NULL }


/*
 * sent to the Router, used as Template
 */
struct  _Broker__DeviceActivationResponse
{
  ProtobufCMessage base;
  ProtobufCBinaryData payload;
  Protocol__Message *message;
  Broker__DownlinkOption *downlink_option;
  Trace__Trace *trace;
};
#define BROKER__DEVICE_ACTIVATION_RESPONSE__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&broker__device_activation_response__descriptor) \
    , {0,NULL}, NULL, NULL, NULL }


/*
 * sent to the Handler
 */
struct  _Broker__DeduplicatedUplinkMessage
{
  ProtobufCMessage base;
  ProtobufCBinaryData payload;
  Protocol__Message *message;
  ProtobufCBinaryData dev_eui;
  ProtobufCBinaryData app_eui;
  char *app_id;
  char *dev_id;
  Protocol__RxMetadata *protocol_metadata;
  size_t n_gateway_metadata;
  Gateway__RxMetadata **gateway_metadata;
  int64_t server_time;
  Broker__DownlinkMessage *response_template;
  Trace__Trace *trace;
};
#define BROKER__DEDUPLICATED_UPLINK_MESSAGE__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&broker__deduplicated_uplink_message__descriptor) \
    , {0,NULL}, NULL, {0,NULL}, {0,NULL}, (char *)protobuf_c_empty_string, (char *)protobuf_c_empty_string, NULL, 0,NULL, 0, NULL, NULL }


/*
 * received from the Router
 */
struct  _Broker__DeviceActivationRequest
{
  ProtobufCMessage base;
  ProtobufCBinaryData payload;
  Protocol__Message *message;
  ProtobufCBinaryData dev_eui;
  ProtobufCBinaryData app_eui;
  Protocol__RxMetadata *protocol_metadata;
  Gateway__RxMetadata *gateway_metadata;
  Protocol__ActivationMetadata *activation_metadata;
  size_t n_downlink_options;
  Broker__DownlinkOption **downlink_options;
  Trace__Trace *trace;
};
#define BROKER__DEVICE_ACTIVATION_REQUEST__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&broker__device_activation_request__descriptor) \
    , {0,NULL}, NULL, {0,NULL}, {0,NULL}, NULL, NULL, NULL, 0,NULL, NULL }


/*
 * sent to the Handler
 */
struct  _Broker__DeduplicatedDeviceActivationRequest
{
  ProtobufCMessage base;
  ProtobufCBinaryData payload;
  Protocol__Message *message;
  ProtobufCBinaryData dev_eui;
  ProtobufCBinaryData app_eui;
  char *app_id;
  char *dev_id;
  Protocol__RxMetadata *protocol_metadata;
  size_t n_gateway_metadata;
  Gateway__RxMetadata **gateway_metadata;
  Protocol__ActivationMetadata *activation_metadata;
  int64_t server_time;
  Broker__DeviceActivationResponse *response_template;
  Trace__Trace *trace;
};
#define BROKER__DEDUPLICATED_DEVICE_ACTIVATION_REQUEST__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&broker__deduplicated_device_activation_request__descriptor) \
    , {0,NULL}, NULL, {0,NULL}, {0,NULL}, (char *)protobuf_c_empty_string, (char *)protobuf_c_empty_string, NULL, 0,NULL, NULL, 0, NULL, NULL }


struct  _Broker__ActivationChallengeRequest
{
  ProtobufCMessage base;
  ProtobufCBinaryData payload;
  Protocol__Message *message;
  ProtobufCBinaryData dev_eui;
  ProtobufCBinaryData app_eui;
  char *app_id;
  char *dev_id;
};
#define BROKER__ACTIVATION_CHALLENGE_REQUEST__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&broker__activation_challenge_request__descriptor) \
    , {0,NULL}, NULL, {0,NULL}, {0,NULL}, (char *)protobuf_c_empty_string, (char *)protobuf_c_empty_string }


struct  _Broker__ActivationChallengeResponse
{
  ProtobufCMessage base;
  ProtobufCBinaryData payload;
  Protocol__Message *message;
};
#define BROKER__ACTIVATION_CHALLENGE_RESPONSE__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&broker__activation_challenge_response__descriptor) \
    , {0,NULL}, NULL }


/*
 * message SubscribeRequest is used by a Handler to subscribe to uplink messages
 */
struct  _Broker__SubscribeRequest
{
  ProtobufCMessage base;
};
#define BROKER__SUBSCRIBE_REQUEST__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&broker__subscribe_request__descriptor) \
     }


/*
 * message StatusRequest is used to request the status of this Broker
 */
struct  _Broker__StatusRequest
{
  ProtobufCMessage base;
};
#define BROKER__STATUS_REQUEST__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&broker__status_request__descriptor) \
     }


struct  _Broker__Status
{
  ProtobufCMessage base;
  Api__SystemStats *system;
  Api__ComponentStats *component;
  Api__Rates *uplink;
  Api__Rates *uplink_unique;
  Api__Rates *downlink;
  Api__Rates *activations;
  Api__Rates *activations_unique;
  Api__Percentiles *deduplication;
  /*
   * Connections
   */
  uint32_t connected_routers;
  uint32_t connected_handlers;
};
#define BROKER__STATUS__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&broker__status__descriptor) \
    , NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, 0 }


struct  _Broker__ApplicationHandlerRegistration
{
  ProtobufCMessage base;
  char *app_id;
  char *handler_id;
};
#define BROKER__APPLICATION_HANDLER_REGISTRATION__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&broker__application_handler_registration__descriptor) \
    , (char *)protobuf_c_empty_string, (char *)protobuf_c_empty_string }


/* Broker__DownlinkOption methods */
void   broker__downlink_option__init
                     (Broker__DownlinkOption         *message);
size_t broker__downlink_option__get_packed_size
                     (const Broker__DownlinkOption   *message);
size_t broker__downlink_option__pack
                     (const Broker__DownlinkOption   *message,
                      uint8_t             *out);
size_t broker__downlink_option__pack_to_buffer
                     (const Broker__DownlinkOption   *message,
                      ProtobufCBuffer     *buffer);
Broker__DownlinkOption *
       broker__downlink_option__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   broker__downlink_option__free_unpacked
                     (Broker__DownlinkOption *message,
                      ProtobufCAllocator *allocator);
/* Broker__UplinkMessage methods */
void   broker__uplink_message__init
                     (Broker__UplinkMessage         *message);
size_t broker__uplink_message__get_packed_size
                     (const Broker__UplinkMessage   *message);
size_t broker__uplink_message__pack
                     (const Broker__UplinkMessage   *message,
                      uint8_t             *out);
size_t broker__uplink_message__pack_to_buffer
                     (const Broker__UplinkMessage   *message,
                      ProtobufCBuffer     *buffer);
Broker__UplinkMessage *
       broker__uplink_message__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   broker__uplink_message__free_unpacked
                     (Broker__UplinkMessage *message,
                      ProtobufCAllocator *allocator);
/* Broker__DownlinkMessage methods */
void   broker__downlink_message__init
                     (Broker__DownlinkMessage         *message);
size_t broker__downlink_message__get_packed_size
                     (const Broker__DownlinkMessage   *message);
size_t broker__downlink_message__pack
                     (const Broker__DownlinkMessage   *message,
                      uint8_t             *out);
size_t broker__downlink_message__pack_to_buffer
                     (const Broker__DownlinkMessage   *message,
                      ProtobufCBuffer     *buffer);
Broker__DownlinkMessage *
       broker__downlink_message__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   broker__downlink_message__free_unpacked
                     (Broker__DownlinkMessage *message,
                      ProtobufCAllocator *allocator);
/* Broker__DeviceActivationResponse methods */
void   broker__device_activation_response__init
                     (Broker__DeviceActivationResponse         *message);
size_t broker__device_activation_response__get_packed_size
                     (const Broker__DeviceActivationResponse   *message);
size_t broker__device_activation_response__pack
                     (const Broker__DeviceActivationResponse   *message,
                      uint8_t             *out);
size_t broker__device_activation_response__pack_to_buffer
                     (const Broker__DeviceActivationResponse   *message,
                      ProtobufCBuffer     *buffer);
Broker__DeviceActivationResponse *
       broker__device_activation_response__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   broker__device_activation_response__free_unpacked
                     (Broker__DeviceActivationResponse *message,
                      ProtobufCAllocator *allocator);
/* Broker__DeduplicatedUplinkMessage methods */
void   broker__deduplicated_uplink_message__init
                     (Broker__DeduplicatedUplinkMessage         *message);
size_t broker__deduplicated_uplink_message__get_packed_size
                     (const Broker__DeduplicatedUplinkMessage   *message);
size_t broker__deduplicated_uplink_message__pack
                     (const Broker__DeduplicatedUplinkMessage   *message,
                      uint8_t             *out);
size_t broker__deduplicated_uplink_message__pack_to_buffer
                     (const Broker__DeduplicatedUplinkMessage   *message,
                      ProtobufCBuffer     *buffer);
Broker__DeduplicatedUplinkMessage *
       broker__deduplicated_uplink_message__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   broker__deduplicated_uplink_message__free_unpacked
                     (Broker__DeduplicatedUplinkMessage *message,
                      ProtobufCAllocator *allocator);
/* Broker__DeviceActivationRequest methods */
void   broker__device_activation_request__init
                     (Broker__DeviceActivationRequest         *message);
size_t broker__device_activation_request__get_packed_size
                     (const Broker__DeviceActivationRequest   *message);
size_t broker__device_activation_request__pack
                     (const Broker__DeviceActivationRequest   *message,
                      uint8_t             *out);
size_t broker__device_activation_request__pack_to_buffer
                     (const Broker__DeviceActivationRequest   *message,
                      ProtobufCBuffer     *buffer);
Broker__DeviceActivationRequest *
       broker__device_activation_request__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   broker__device_activation_request__free_unpacked
                     (Broker__DeviceActivationRequest *message,
                      ProtobufCAllocator *allocator);
/* Broker__DeduplicatedDeviceActivationRequest methods */
void   broker__deduplicated_device_activation_request__init
                     (Broker__DeduplicatedDeviceActivationRequest         *message);
size_t broker__deduplicated_device_activation_request__get_packed_size
                     (const Broker__DeduplicatedDeviceActivationRequest   *message);
size_t broker__deduplicated_device_activation_request__pack
                     (const Broker__DeduplicatedDeviceActivationRequest   *message,
                      uint8_t             *out);
size_t broker__deduplicated_device_activation_request__pack_to_buffer
                     (const Broker__DeduplicatedDeviceActivationRequest   *message,
                      ProtobufCBuffer     *buffer);
Broker__DeduplicatedDeviceActivationRequest *
       broker__deduplicated_device_activation_request__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   broker__deduplicated_device_activation_request__free_unpacked
                     (Broker__DeduplicatedDeviceActivationRequest *message,
                      ProtobufCAllocator *allocator);
/* Broker__ActivationChallengeRequest methods */
void   broker__activation_challenge_request__init
                     (Broker__ActivationChallengeRequest         *message);
size_t broker__activation_challenge_request__get_packed_size
                     (const Broker__ActivationChallengeRequest   *message);
size_t broker__activation_challenge_request__pack
                     (const Broker__ActivationChallengeRequest   *message,
                      uint8_t             *out);
size_t broker__activation_challenge_request__pack_to_buffer
                     (const Broker__ActivationChallengeRequest   *message,
                      ProtobufCBuffer     *buffer);
Broker__ActivationChallengeRequest *
       broker__activation_challenge_request__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   broker__activation_challenge_request__free_unpacked
                     (Broker__ActivationChallengeRequest *message,
                      ProtobufCAllocator *allocator);
/* Broker__ActivationChallengeResponse methods */
void   broker__activation_challenge_response__init
                     (Broker__ActivationChallengeResponse         *message);
size_t broker__activation_challenge_response__get_packed_size
                     (const Broker__ActivationChallengeResponse   *message);
size_t broker__activation_challenge_response__pack
                     (const Broker__ActivationChallengeResponse   *message,
                      uint8_t             *out);
size_t broker__activation_challenge_response__pack_to_buffer
                     (const Broker__ActivationChallengeResponse   *message,
                      ProtobufCBuffer     *buffer);
Broker__ActivationChallengeResponse *
       broker__activation_challenge_response__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   broker__activation_challenge_response__free_unpacked
                     (Broker__ActivationChallengeResponse *message,
                      ProtobufCAllocator *allocator);
/* Broker__SubscribeRequest methods */
void   broker__subscribe_request__init
                     (Broker__SubscribeRequest         *message);
size_t broker__subscribe_request__get_packed_size
                     (const Broker__SubscribeRequest   *message);
size_t broker__subscribe_request__pack
                     (const Broker__SubscribeRequest   *message,
                      uint8_t             *out);
size_t broker__subscribe_request__pack_to_buffer
                     (const Broker__SubscribeRequest   *message,
                      ProtobufCBuffer     *buffer);
Broker__SubscribeRequest *
       broker__subscribe_request__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   broker__subscribe_request__free_unpacked
                     (Broker__SubscribeRequest *message,
                      ProtobufCAllocator *allocator);
/* Broker__StatusRequest methods */
void   broker__status_request__init
                     (Broker__StatusRequest         *message);
size_t broker__status_request__get_packed_size
                     (const Broker__StatusRequest   *message);
size_t broker__status_request__pack
                     (const Broker__StatusRequest   *message,
                      uint8_t             *out);
size_t broker__status_request__pack_to_buffer
                     (const Broker__StatusRequest   *message,
                      ProtobufCBuffer     *buffer);
Broker__StatusRequest *
       broker__status_request__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   broker__status_request__free_unpacked
                     (Broker__StatusRequest *message,
                      ProtobufCAllocator *allocator);
/* Broker__Status methods */
void   broker__status__init
                     (Broker__Status         *message);
size_t broker__status__get_packed_size
                     (const Broker__Status   *message);
size_t broker__status__pack
                     (const Broker__Status   *message,
                      uint8_t             *out);
size_t broker__status__pack_to_buffer
                     (const Broker__Status   *message,
                      ProtobufCBuffer     *buffer);
Broker__Status *
       broker__status__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   broker__status__free_unpacked
                     (Broker__Status *message,
                      ProtobufCAllocator *allocator);
/* Broker__ApplicationHandlerRegistration methods */
void   broker__application_handler_registration__init
                     (Broker__ApplicationHandlerRegistration         *message);
size_t broker__application_handler_registration__get_packed_size
                     (const Broker__ApplicationHandlerRegistration   *message);
size_t broker__application_handler_registration__pack
                     (const Broker__ApplicationHandlerRegistration   *message,
                      uint8_t             *out);
size_t broker__application_handler_registration__pack_to_buffer
                     (const Broker__ApplicationHandlerRegistration   *message,
                      ProtobufCBuffer     *buffer);
Broker__ApplicationHandlerRegistration *
       broker__application_handler_registration__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   broker__application_handler_registration__free_unpacked
                     (Broker__ApplicationHandlerRegistration *message,
                      ProtobufCAllocator *allocator);
/* --- per-message closures --- */

typedef void (*Broker__DownlinkOption_Closure)
                 (const Broker__DownlinkOption *message,
                  void *closure_data);
typedef void (*Broker__UplinkMessage_Closure)
                 (const Broker__UplinkMessage *message,
                  void *closure_data);
typedef void (*Broker__DownlinkMessage_Closure)
                 (const Broker__DownlinkMessage *message,
                  void *closure_data);
typedef void (*Broker__DeviceActivationResponse_Closure)
                 (const Broker__DeviceActivationResponse *message,
                  void *closure_data);
typedef void (*Broker__DeduplicatedUplinkMessage_Closure)
                 (const Broker__DeduplicatedUplinkMessage *message,
                  void *closure_data);
typedef void (*Broker__DeviceActivationRequest_Closure)
                 (const Broker__DeviceActivationRequest *message,
                  void *closure_data);
typedef void (*Broker__DeduplicatedDeviceActivationRequest_Closure)
                 (const Broker__DeduplicatedDeviceActivationRequest *message,
                  void *closure_data);
typedef void (*Broker__ActivationChallengeRequest_Closure)
                 (const Broker__ActivationChallengeRequest *message,
                  void *closure_data);
typedef void (*Broker__ActivationChallengeResponse_Closure)
                 (const Broker__ActivationChallengeResponse *message,
                  void *closure_data);
typedef void (*Broker__SubscribeRequest_Closure)
                 (const Broker__SubscribeRequest *message,
                  void *closure_data);
typedef void (*Broker__StatusRequest_Closure)
                 (const Broker__StatusRequest *message,
                  void *closure_data);
typedef void (*Broker__Status_Closure)
                 (const Broker__Status *message,
                  void *closure_data);
typedef void (*Broker__ApplicationHandlerRegistration_Closure)
                 (const Broker__ApplicationHandlerRegistration *message,
                  void *closure_data);

/* --- services --- */

typedef struct _Broker__Broker_Service Broker__Broker_Service;
struct _Broker__Broker_Service
{
  ProtobufCService base;
  void (*associate)(Broker__Broker_Service *service,
                    const Broker__UplinkMessage *input,
                    Broker__DownlinkMessage_Closure closure,
                    void *closure_data);
  void (*subscribe)(Broker__Broker_Service *service,
                    const Broker__SubscribeRequest *input,
                    Broker__DeduplicatedUplinkMessage_Closure closure,
                    void *closure_data);
  void (*publish)(Broker__Broker_Service *service,
                  const Broker__DownlinkMessage *input,
                  Google__Protobuf__Empty_Closure closure,
                  void *closure_data);
  void (*activate)(Broker__Broker_Service *service,
                   const Broker__DeviceActivationRequest *input,
                   Broker__DeviceActivationResponse_Closure closure,
                   void *closure_data);
};
typedef void (*Broker__Broker_ServiceDestroy)(Broker__Broker_Service *);
void broker__broker__init (Broker__Broker_Service *service,
                           Broker__Broker_ServiceDestroy destroy);
#define BROKER__BROKER__BASE_INIT \
    { &broker__broker__descriptor, protobuf_c_service_invoke_internal, NULL }
#define BROKER__BROKER__INIT(function_prefix__) \
    { BROKER__BROKER__BASE_INIT,\
      function_prefix__ ## associate,\
      function_prefix__ ## subscribe,\
      function_prefix__ ## publish,\
      function_prefix__ ## activate  }
void broker__broker__associate(ProtobufCService *service,
                               const Broker__UplinkMessage *input,
                               Broker__DownlinkMessage_Closure closure,
                               void *closure_data);
void broker__broker__subscribe(ProtobufCService *service,
                               const Broker__SubscribeRequest *input,
                               Broker__DeduplicatedUplinkMessage_Closure closure,
                               void *closure_data);
void broker__broker__publish(ProtobufCService *service,
                             const Broker__DownlinkMessage *input,
                             Google__Protobuf__Empty_Closure closure,
                             void *closure_data);
void broker__broker__activate(ProtobufCService *service,
                              const Broker__DeviceActivationRequest *input,
                              Broker__DeviceActivationResponse_Closure closure,
                              void *closure_data);
typedef struct _Broker__BrokerManager_Service Broker__BrokerManager_Service;
struct _Broker__BrokerManager_Service
{
  ProtobufCService base;
  void (*register_application_handler)(Broker__BrokerManager_Service *service,
                                       const Broker__ApplicationHandlerRegistration *input,
                                       Google__Protobuf__Empty_Closure closure,
                                       void *closure_data);
  void (*get_status)(Broker__BrokerManager_Service *service,
                     const Broker__StatusRequest *input,
                     Broker__Status_Closure closure,
                     void *closure_data);
};
typedef void (*Broker__BrokerManager_ServiceDestroy)(Broker__BrokerManager_Service *);
void broker__broker_manager__init (Broker__BrokerManager_Service *service,
                                   Broker__BrokerManager_ServiceDestroy destroy);
#define BROKER__BROKER_MANAGER__BASE_INIT \
    { &broker__broker_manager__descriptor, protobuf_c_service_invoke_internal, NULL }
#define BROKER__BROKER_MANAGER__INIT(function_prefix__) \
    { BROKER__BROKER_MANAGER__BASE_INIT,\
      function_prefix__ ## register_application_handler,\
      function_prefix__ ## get_status  }
void broker__broker_manager__register_application_handler(ProtobufCService *service,
                                                          const Broker__ApplicationHandlerRegistration *input,
                                                          Google__Protobuf__Empty_Closure closure,
                                                          void *closure_data);
void broker__broker_manager__get_status(ProtobufCService *service,
                                        const Broker__StatusRequest *input,
                                        Broker__Status_Closure closure,
                                        void *closure_data);

/* --- descriptors --- */

extern const ProtobufCMessageDescriptor broker__downlink_option__descriptor;
extern const ProtobufCMessageDescriptor broker__uplink_message__descriptor;
extern const ProtobufCMessageDescriptor broker__downlink_message__descriptor;
extern const ProtobufCMessageDescriptor broker__device_activation_response__descriptor;
extern const ProtobufCMessageDescriptor broker__deduplicated_uplink_message__descriptor;
extern const ProtobufCMessageDescriptor broker__device_activation_request__descriptor;
extern const ProtobufCMessageDescriptor broker__deduplicated_device_activation_request__descriptor;
extern const ProtobufCMessageDescriptor broker__activation_challenge_request__descriptor;
extern const ProtobufCMessageDescriptor broker__activation_challenge_response__descriptor;
extern const ProtobufCMessageDescriptor broker__subscribe_request__descriptor;
extern const ProtobufCMessageDescriptor broker__status_request__descriptor;
extern const ProtobufCMessageDescriptor broker__status__descriptor;
extern const ProtobufCMessageDescriptor broker__application_handler_registration__descriptor;
extern const ProtobufCServiceDescriptor broker__broker__descriptor;
extern const ProtobufCServiceDescriptor broker__broker_manager__descriptor;

PROTOBUF_C__END_DECLS


#endif  /* PROTOBUF_C_github_2ecom_2fTheThingsNetwork_2fapi_2fbroker_2fbroker_2eproto__INCLUDED */
