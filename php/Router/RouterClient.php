<?php
// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.
//
namespace Router;

/**
 * The Router service provides pure network functionality
 */
class RouterClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * Gateway streams status messages to Router
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GatewayStatus($metadata = [], $options = []) {
        return $this->_clientStreamRequest('/router.Router/GatewayStatus',
        ['\Google\Protobuf\GPBEmpty','decode'],
        $metadata, $options);
    }

    /**
     * Gateway streams uplink messages to Router
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Uplink($metadata = [], $options = []) {
        return $this->_clientStreamRequest('/router.Router/Uplink',
        ['\Google\Protobuf\GPBEmpty','decode'],
        $metadata, $options);
    }

    /**
     * Gateway subscribes to downlink messages from Router
     * It is possible to open multiple subscriptions (but not recommended).
     * If you do this, you are responsible for de-duplication of downlink messages.
     * @param \Router\SubscribeRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Subscribe(\Router\SubscribeRequest $argument,
      $metadata = [], $options = []) {
        return $this->_serverStreamRequest('/router.Router/Subscribe',
        $argument,
        ['\Router\DownlinkMessage', 'decode'],
        $metadata, $options);
    }

    /**
     * Gateway requests device activation
     * @param \Router\DeviceActivationRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Activate(\Router\DeviceActivationRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/router.Router/Activate',
        $argument,
        ['\Router\DeviceActivationResponse', 'decode'],
        $metadata, $options);
    }

}
