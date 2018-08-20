/* Generated by the protocol buffer compiler.  DO NOT EDIT! */
/* Generated from: github.com/TheThingsNetwork/api/protocol/lorawan/lorawan.proto */

#ifndef PROTOBUF_C_github_2ecom_2fTheThingsNetwork_2fapi_2fprotocol_2florawan_2florawan_2eproto__INCLUDED
#define PROTOBUF_C_github_2ecom_2fTheThingsNetwork_2fapi_2fprotocol_2florawan_2florawan_2eproto__INCLUDED

#include <protobuf-c/protobuf-c.h>

PROTOBUF_C__BEGIN_DECLS

#if PROTOBUF_C_VERSION_NUMBER < 1003000
# error This file was generated by a newer version of protoc-c which is incompatible with your libprotobuf-c headers. Please update your headers.
#elif 1003001 < PROTOBUF_C_MIN_COMPILER_VERSION
# error This file was generated by an older version of protoc-c which is incompatible with your libprotobuf-c headers. Please regenerate this file with a newer version of protoc-c.
#endif

#include "github.com/gogo/protobuf/gogoproto/gogo.pb-c.h"

typedef struct _Lorawan__Metadata Lorawan__Metadata;
typedef struct _Lorawan__TxConfiguration Lorawan__TxConfiguration;
typedef struct _Lorawan__ActivationMetadata Lorawan__ActivationMetadata;
typedef struct _Lorawan__Message Lorawan__Message;
typedef struct _Lorawan__MHDR Lorawan__MHDR;
typedef struct _Lorawan__MACPayload Lorawan__MACPayload;
typedef struct _Lorawan__FHDR Lorawan__FHDR;
typedef struct _Lorawan__FCtrl Lorawan__FCtrl;
typedef struct _Lorawan__MACCommand Lorawan__MACCommand;
typedef struct _Lorawan__JoinRequestPayload Lorawan__JoinRequestPayload;
typedef struct _Lorawan__JoinAcceptPayload Lorawan__JoinAcceptPayload;
typedef struct _Lorawan__DLSettings Lorawan__DLSettings;
typedef struct _Lorawan__CFList Lorawan__CFList;


/* --- enums --- */

typedef enum _Lorawan__Modulation {
  LORAWAN__MODULATION__LORA = 0,
  LORAWAN__MODULATION__FSK = 1
    PROTOBUF_C__FORCE_ENUM_TO_BE_INT_SIZE(LORAWAN__MODULATION)
} Lorawan__Modulation;
typedef enum _Lorawan__FrequencyPlan {
  LORAWAN__FREQUENCY_PLAN__EU_863_870 = 0,
  LORAWAN__FREQUENCY_PLAN__US_902_928 = 1,
  LORAWAN__FREQUENCY_PLAN__CN_779_787 = 2,
  LORAWAN__FREQUENCY_PLAN__EU_433 = 3,
  LORAWAN__FREQUENCY_PLAN__AU_915_928 = 4,
  LORAWAN__FREQUENCY_PLAN__CN_470_510 = 5,
  LORAWAN__FREQUENCY_PLAN__AS_923 = 6,
  LORAWAN__FREQUENCY_PLAN__AS_920_923 = 61,
  LORAWAN__FREQUENCY_PLAN__AS_923_925 = 62,
  LORAWAN__FREQUENCY_PLAN__KR_920_923 = 7,
  LORAWAN__FREQUENCY_PLAN__IN_865_867 = 8
    PROTOBUF_C__FORCE_ENUM_TO_BE_INT_SIZE(LORAWAN__FREQUENCY_PLAN)
} Lorawan__FrequencyPlan;
typedef enum _Lorawan__Major {
  LORAWAN__MAJOR__LORAWAN_R1 = 0
    PROTOBUF_C__FORCE_ENUM_TO_BE_INT_SIZE(LORAWAN__MAJOR)
} Lorawan__Major;
typedef enum _Lorawan__MType {
  LORAWAN__MTYPE__JOIN_REQUEST = 0,
  LORAWAN__MTYPE__JOIN_ACCEPT = 1,
  LORAWAN__MTYPE__UNCONFIRMED_UP = 2,
  LORAWAN__MTYPE__UNCONFIRMED_DOWN = 3,
  LORAWAN__MTYPE__CONFIRMED_UP = 4,
  LORAWAN__MTYPE__CONFIRMED_DOWN = 5
    PROTOBUF_C__FORCE_ENUM_TO_BE_INT_SIZE(LORAWAN__MTYPE)
} Lorawan__MType;

/* --- messages --- */

struct  _Lorawan__Metadata
{
  ProtobufCMessage base;
  Lorawan__Modulation modulation;
  /*
   * LoRa data rate - SF{spreadingfactor}BW{bandwidth}
   */
  char *data_rate;
  /*
   * FSK bit rate in bit/s
   */
  uint32_t bit_rate;
  /*
   * LoRa coding rate
   */
  char *coding_rate;
  /*
   * Store the full 32 bit FCnt (deprecated; do not use)
   */
  uint32_t f_cnt;
  Lorawan__FrequencyPlan frequency_plan;
};
#define LORAWAN__METADATA__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&lorawan__metadata__descriptor) \
    , LORAWAN__MODULATION__LORA, (char *)protobuf_c_empty_string, 0, (char *)protobuf_c_empty_string, 0, LORAWAN__FREQUENCY_PLAN__EU_863_870 }


struct  _Lorawan__TxConfiguration
{
  ProtobufCMessage base;
  Lorawan__Modulation modulation;
  /*
   * LoRa data rate - SF{spreadingfactor}BW{bandwidth}
   */
  char *data_rate;
  /*
   * FSK bit rate in bit/s
   */
  uint32_t bit_rate;
  /*
   * LoRa coding rate
   */
  char *coding_rate;
  /*
   * Store the full 32 bit FCnt (deprecated; do not use)
   */
  uint32_t f_cnt;
};
#define LORAWAN__TX_CONFIGURATION__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&lorawan__tx_configuration__descriptor) \
    , LORAWAN__MODULATION__LORA, (char *)protobuf_c_empty_string, 0, (char *)protobuf_c_empty_string, 0 }


struct  _Lorawan__ActivationMetadata
{
  ProtobufCMessage base;
  ProtobufCBinaryData app_eui;
  ProtobufCBinaryData dev_eui;
  ProtobufCBinaryData dev_addr;
  ProtobufCBinaryData nwk_s_key;
  uint32_t rx1_dr_offset;
  uint32_t rx2_dr;
  uint32_t rx_delay;
  Lorawan__CFList *cf_list;
  Lorawan__FrequencyPlan frequency_plan;
};
#define LORAWAN__ACTIVATION_METADATA__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&lorawan__activation_metadata__descriptor) \
    , {0,NULL}, {0,NULL}, {0,NULL}, {0,NULL}, 0, 0, 0, NULL, LORAWAN__FREQUENCY_PLAN__EU_863_870 }


typedef enum {
  LORAWAN__MESSAGE__PAYLOAD__NOT_SET = 0,
  LORAWAN__MESSAGE__PAYLOAD_MAC_PAYLOAD = 3,
  LORAWAN__MESSAGE__PAYLOAD_JOIN_REQUEST_PAYLOAD = 4,
  LORAWAN__MESSAGE__PAYLOAD_JOIN_ACCEPT_PAYLOAD = 5
    PROTOBUF_C__FORCE_ENUM_TO_BE_INT_SIZE(LORAWAN__MESSAGE__PAYLOAD)
} Lorawan__Message__PayloadCase;

struct  _Lorawan__Message
{
  ProtobufCMessage base;
  Lorawan__MHDR *m_hdr;
  ProtobufCBinaryData mic;
  Lorawan__Message__PayloadCase payload_case;
  union {
    Lorawan__MACPayload *mac_payload;
    Lorawan__JoinRequestPayload *join_request_payload;
    Lorawan__JoinAcceptPayload *join_accept_payload;
  };
};
#define LORAWAN__MESSAGE__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&lorawan__message__descriptor) \
    , NULL, {0,NULL}, LORAWAN__MESSAGE__PAYLOAD__NOT_SET, {0} }


struct  _Lorawan__MHDR
{
  ProtobufCMessage base;
  Lorawan__MType m_type;
  Lorawan__Major major;
};
#define LORAWAN__MHDR__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&lorawan__mhdr__descriptor) \
    , LORAWAN__MTYPE__JOIN_REQUEST, LORAWAN__MAJOR__LORAWAN_R1 }


struct  _Lorawan__MACPayload
{
  ProtobufCMessage base;
  Lorawan__FHDR *f_hdr;
  int32_t f_port;
  ProtobufCBinaryData frm_payload;
};
#define LORAWAN__MACPAYLOAD__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&lorawan__macpayload__descriptor) \
    , NULL, 0, {0,NULL} }


struct  _Lorawan__FHDR
{
  ProtobufCMessage base;
  ProtobufCBinaryData dev_addr;
  Lorawan__FCtrl *f_ctrl;
  uint32_t f_cnt;
  size_t n_f_opts;
  Lorawan__MACCommand **f_opts;
};
#define LORAWAN__FHDR__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&lorawan__fhdr__descriptor) \
    , {0,NULL}, NULL, 0, 0,NULL }


struct  _Lorawan__FCtrl
{
  ProtobufCMessage base;
  protobuf_c_boolean adr;
  protobuf_c_boolean adr_ack_req;
  protobuf_c_boolean ack;
  protobuf_c_boolean f_pending;
};
#define LORAWAN__FCTRL__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&lorawan__fctrl__descriptor) \
    , 0, 0, 0, 0 }


struct  _Lorawan__MACCommand
{
  ProtobufCMessage base;
  uint32_t cid;
  ProtobufCBinaryData payload;
};
#define LORAWAN__MACCOMMAND__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&lorawan__maccommand__descriptor) \
    , 0, {0,NULL} }


struct  _Lorawan__JoinRequestPayload
{
  ProtobufCMessage base;
  ProtobufCBinaryData app_eui;
  ProtobufCBinaryData dev_eui;
  ProtobufCBinaryData dev_nonce;
};
#define LORAWAN__JOIN_REQUEST_PAYLOAD__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&lorawan__join_request_payload__descriptor) \
    , {0,NULL}, {0,NULL}, {0,NULL} }


struct  _Lorawan__JoinAcceptPayload
{
  ProtobufCMessage base;
  ProtobufCBinaryData encrypted;
  ProtobufCBinaryData app_nonce;
  ProtobufCBinaryData net_id;
  ProtobufCBinaryData dev_addr;
  Lorawan__DLSettings *dl_settings;
  uint32_t rx_delay;
  Lorawan__CFList *cf_list;
};
#define LORAWAN__JOIN_ACCEPT_PAYLOAD__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&lorawan__join_accept_payload__descriptor) \
    , {0,NULL}, {0,NULL}, {0,NULL}, {0,NULL}, NULL, 0, NULL }


struct  _Lorawan__DLSettings
{
  ProtobufCMessage base;
  uint32_t rx1_dr_offset;
  uint32_t rx2_dr;
};
#define LORAWAN__DLSETTINGS__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&lorawan__dlsettings__descriptor) \
    , 0, 0 }


struct  _Lorawan__CFList
{
  ProtobufCMessage base;
  size_t n_freq;
  uint32_t *freq;
};
#define LORAWAN__CFLIST__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&lorawan__cflist__descriptor) \
    , 0,NULL }


/* Lorawan__Metadata methods */
void   lorawan__metadata__init
                     (Lorawan__Metadata         *message);
size_t lorawan__metadata__get_packed_size
                     (const Lorawan__Metadata   *message);
size_t lorawan__metadata__pack
                     (const Lorawan__Metadata   *message,
                      uint8_t             *out);
size_t lorawan__metadata__pack_to_buffer
                     (const Lorawan__Metadata   *message,
                      ProtobufCBuffer     *buffer);
Lorawan__Metadata *
       lorawan__metadata__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   lorawan__metadata__free_unpacked
                     (Lorawan__Metadata *message,
                      ProtobufCAllocator *allocator);
/* Lorawan__TxConfiguration methods */
void   lorawan__tx_configuration__init
                     (Lorawan__TxConfiguration         *message);
size_t lorawan__tx_configuration__get_packed_size
                     (const Lorawan__TxConfiguration   *message);
size_t lorawan__tx_configuration__pack
                     (const Lorawan__TxConfiguration   *message,
                      uint8_t             *out);
size_t lorawan__tx_configuration__pack_to_buffer
                     (const Lorawan__TxConfiguration   *message,
                      ProtobufCBuffer     *buffer);
Lorawan__TxConfiguration *
       lorawan__tx_configuration__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   lorawan__tx_configuration__free_unpacked
                     (Lorawan__TxConfiguration *message,
                      ProtobufCAllocator *allocator);
/* Lorawan__ActivationMetadata methods */
void   lorawan__activation_metadata__init
                     (Lorawan__ActivationMetadata         *message);
size_t lorawan__activation_metadata__get_packed_size
                     (const Lorawan__ActivationMetadata   *message);
size_t lorawan__activation_metadata__pack
                     (const Lorawan__ActivationMetadata   *message,
                      uint8_t             *out);
size_t lorawan__activation_metadata__pack_to_buffer
                     (const Lorawan__ActivationMetadata   *message,
                      ProtobufCBuffer     *buffer);
Lorawan__ActivationMetadata *
       lorawan__activation_metadata__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   lorawan__activation_metadata__free_unpacked
                     (Lorawan__ActivationMetadata *message,
                      ProtobufCAllocator *allocator);
/* Lorawan__Message methods */
void   lorawan__message__init
                     (Lorawan__Message         *message);
size_t lorawan__message__get_packed_size
                     (const Lorawan__Message   *message);
size_t lorawan__message__pack
                     (const Lorawan__Message   *message,
                      uint8_t             *out);
size_t lorawan__message__pack_to_buffer
                     (const Lorawan__Message   *message,
                      ProtobufCBuffer     *buffer);
Lorawan__Message *
       lorawan__message__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   lorawan__message__free_unpacked
                     (Lorawan__Message *message,
                      ProtobufCAllocator *allocator);
/* Lorawan__MHDR methods */
void   lorawan__mhdr__init
                     (Lorawan__MHDR         *message);
size_t lorawan__mhdr__get_packed_size
                     (const Lorawan__MHDR   *message);
size_t lorawan__mhdr__pack
                     (const Lorawan__MHDR   *message,
                      uint8_t             *out);
size_t lorawan__mhdr__pack_to_buffer
                     (const Lorawan__MHDR   *message,
                      ProtobufCBuffer     *buffer);
Lorawan__MHDR *
       lorawan__mhdr__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   lorawan__mhdr__free_unpacked
                     (Lorawan__MHDR *message,
                      ProtobufCAllocator *allocator);
/* Lorawan__MACPayload methods */
void   lorawan__macpayload__init
                     (Lorawan__MACPayload         *message);
size_t lorawan__macpayload__get_packed_size
                     (const Lorawan__MACPayload   *message);
size_t lorawan__macpayload__pack
                     (const Lorawan__MACPayload   *message,
                      uint8_t             *out);
size_t lorawan__macpayload__pack_to_buffer
                     (const Lorawan__MACPayload   *message,
                      ProtobufCBuffer     *buffer);
Lorawan__MACPayload *
       lorawan__macpayload__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   lorawan__macpayload__free_unpacked
                     (Lorawan__MACPayload *message,
                      ProtobufCAllocator *allocator);
/* Lorawan__FHDR methods */
void   lorawan__fhdr__init
                     (Lorawan__FHDR         *message);
size_t lorawan__fhdr__get_packed_size
                     (const Lorawan__FHDR   *message);
size_t lorawan__fhdr__pack
                     (const Lorawan__FHDR   *message,
                      uint8_t             *out);
size_t lorawan__fhdr__pack_to_buffer
                     (const Lorawan__FHDR   *message,
                      ProtobufCBuffer     *buffer);
Lorawan__FHDR *
       lorawan__fhdr__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   lorawan__fhdr__free_unpacked
                     (Lorawan__FHDR *message,
                      ProtobufCAllocator *allocator);
/* Lorawan__FCtrl methods */
void   lorawan__fctrl__init
                     (Lorawan__FCtrl         *message);
size_t lorawan__fctrl__get_packed_size
                     (const Lorawan__FCtrl   *message);
size_t lorawan__fctrl__pack
                     (const Lorawan__FCtrl   *message,
                      uint8_t             *out);
size_t lorawan__fctrl__pack_to_buffer
                     (const Lorawan__FCtrl   *message,
                      ProtobufCBuffer     *buffer);
Lorawan__FCtrl *
       lorawan__fctrl__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   lorawan__fctrl__free_unpacked
                     (Lorawan__FCtrl *message,
                      ProtobufCAllocator *allocator);
/* Lorawan__MACCommand methods */
void   lorawan__maccommand__init
                     (Lorawan__MACCommand         *message);
size_t lorawan__maccommand__get_packed_size
                     (const Lorawan__MACCommand   *message);
size_t lorawan__maccommand__pack
                     (const Lorawan__MACCommand   *message,
                      uint8_t             *out);
size_t lorawan__maccommand__pack_to_buffer
                     (const Lorawan__MACCommand   *message,
                      ProtobufCBuffer     *buffer);
Lorawan__MACCommand *
       lorawan__maccommand__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   lorawan__maccommand__free_unpacked
                     (Lorawan__MACCommand *message,
                      ProtobufCAllocator *allocator);
/* Lorawan__JoinRequestPayload methods */
void   lorawan__join_request_payload__init
                     (Lorawan__JoinRequestPayload         *message);
size_t lorawan__join_request_payload__get_packed_size
                     (const Lorawan__JoinRequestPayload   *message);
size_t lorawan__join_request_payload__pack
                     (const Lorawan__JoinRequestPayload   *message,
                      uint8_t             *out);
size_t lorawan__join_request_payload__pack_to_buffer
                     (const Lorawan__JoinRequestPayload   *message,
                      ProtobufCBuffer     *buffer);
Lorawan__JoinRequestPayload *
       lorawan__join_request_payload__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   lorawan__join_request_payload__free_unpacked
                     (Lorawan__JoinRequestPayload *message,
                      ProtobufCAllocator *allocator);
/* Lorawan__JoinAcceptPayload methods */
void   lorawan__join_accept_payload__init
                     (Lorawan__JoinAcceptPayload         *message);
size_t lorawan__join_accept_payload__get_packed_size
                     (const Lorawan__JoinAcceptPayload   *message);
size_t lorawan__join_accept_payload__pack
                     (const Lorawan__JoinAcceptPayload   *message,
                      uint8_t             *out);
size_t lorawan__join_accept_payload__pack_to_buffer
                     (const Lorawan__JoinAcceptPayload   *message,
                      ProtobufCBuffer     *buffer);
Lorawan__JoinAcceptPayload *
       lorawan__join_accept_payload__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   lorawan__join_accept_payload__free_unpacked
                     (Lorawan__JoinAcceptPayload *message,
                      ProtobufCAllocator *allocator);
/* Lorawan__DLSettings methods */
void   lorawan__dlsettings__init
                     (Lorawan__DLSettings         *message);
size_t lorawan__dlsettings__get_packed_size
                     (const Lorawan__DLSettings   *message);
size_t lorawan__dlsettings__pack
                     (const Lorawan__DLSettings   *message,
                      uint8_t             *out);
size_t lorawan__dlsettings__pack_to_buffer
                     (const Lorawan__DLSettings   *message,
                      ProtobufCBuffer     *buffer);
Lorawan__DLSettings *
       lorawan__dlsettings__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   lorawan__dlsettings__free_unpacked
                     (Lorawan__DLSettings *message,
                      ProtobufCAllocator *allocator);
/* Lorawan__CFList methods */
void   lorawan__cflist__init
                     (Lorawan__CFList         *message);
size_t lorawan__cflist__get_packed_size
                     (const Lorawan__CFList   *message);
size_t lorawan__cflist__pack
                     (const Lorawan__CFList   *message,
                      uint8_t             *out);
size_t lorawan__cflist__pack_to_buffer
                     (const Lorawan__CFList   *message,
                      ProtobufCBuffer     *buffer);
Lorawan__CFList *
       lorawan__cflist__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   lorawan__cflist__free_unpacked
                     (Lorawan__CFList *message,
                      ProtobufCAllocator *allocator);
/* --- per-message closures --- */

typedef void (*Lorawan__Metadata_Closure)
                 (const Lorawan__Metadata *message,
                  void *closure_data);
typedef void (*Lorawan__TxConfiguration_Closure)
                 (const Lorawan__TxConfiguration *message,
                  void *closure_data);
typedef void (*Lorawan__ActivationMetadata_Closure)
                 (const Lorawan__ActivationMetadata *message,
                  void *closure_data);
typedef void (*Lorawan__Message_Closure)
                 (const Lorawan__Message *message,
                  void *closure_data);
typedef void (*Lorawan__MHDR_Closure)
                 (const Lorawan__MHDR *message,
                  void *closure_data);
typedef void (*Lorawan__MACPayload_Closure)
                 (const Lorawan__MACPayload *message,
                  void *closure_data);
typedef void (*Lorawan__FHDR_Closure)
                 (const Lorawan__FHDR *message,
                  void *closure_data);
typedef void (*Lorawan__FCtrl_Closure)
                 (const Lorawan__FCtrl *message,
                  void *closure_data);
typedef void (*Lorawan__MACCommand_Closure)
                 (const Lorawan__MACCommand *message,
                  void *closure_data);
typedef void (*Lorawan__JoinRequestPayload_Closure)
                 (const Lorawan__JoinRequestPayload *message,
                  void *closure_data);
typedef void (*Lorawan__JoinAcceptPayload_Closure)
                 (const Lorawan__JoinAcceptPayload *message,
                  void *closure_data);
typedef void (*Lorawan__DLSettings_Closure)
                 (const Lorawan__DLSettings *message,
                  void *closure_data);
typedef void (*Lorawan__CFList_Closure)
                 (const Lorawan__CFList *message,
                  void *closure_data);

/* --- services --- */


/* --- descriptors --- */

extern const ProtobufCEnumDescriptor    lorawan__modulation__descriptor;
extern const ProtobufCEnumDescriptor    lorawan__frequency_plan__descriptor;
extern const ProtobufCEnumDescriptor    lorawan__major__descriptor;
extern const ProtobufCEnumDescriptor    lorawan__mtype__descriptor;
extern const ProtobufCMessageDescriptor lorawan__metadata__descriptor;
extern const ProtobufCMessageDescriptor lorawan__tx_configuration__descriptor;
extern const ProtobufCMessageDescriptor lorawan__activation_metadata__descriptor;
extern const ProtobufCMessageDescriptor lorawan__message__descriptor;
extern const ProtobufCMessageDescriptor lorawan__mhdr__descriptor;
extern const ProtobufCMessageDescriptor lorawan__macpayload__descriptor;
extern const ProtobufCMessageDescriptor lorawan__fhdr__descriptor;
extern const ProtobufCMessageDescriptor lorawan__fctrl__descriptor;
extern const ProtobufCMessageDescriptor lorawan__maccommand__descriptor;
extern const ProtobufCMessageDescriptor lorawan__join_request_payload__descriptor;
extern const ProtobufCMessageDescriptor lorawan__join_accept_payload__descriptor;
extern const ProtobufCMessageDescriptor lorawan__dlsettings__descriptor;
extern const ProtobufCMessageDescriptor lorawan__cflist__descriptor;

PROTOBUF_C__END_DECLS


#endif  /* PROTOBUF_C_github_2ecom_2fTheThingsNetwork_2fapi_2fprotocol_2florawan_2florawan_2eproto__INCLUDED */
