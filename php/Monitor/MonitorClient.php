<?php
// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.
//
namespace Monitor;

/**
 */
class MonitorClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function RouterStatus($metadata = [], $options = []) {
        return $this->_clientStreamRequest('/monitor.Monitor/RouterStatus',
        ['\Google\Protobuf\GPBEmpty','decode'],
        $metadata, $options);
    }

    /**
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GatewayStatus($metadata = [], $options = []) {
        return $this->_clientStreamRequest('/monitor.Monitor/GatewayStatus',
        ['\Google\Protobuf\GPBEmpty','decode'],
        $metadata, $options);
    }

    /**
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GatewayUplink($metadata = [], $options = []) {
        return $this->_clientStreamRequest('/monitor.Monitor/GatewayUplink',
        ['\Google\Protobuf\GPBEmpty','decode'],
        $metadata, $options);
    }

    /**
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GatewayDownlink($metadata = [], $options = []) {
        return $this->_clientStreamRequest('/monitor.Monitor/GatewayDownlink',
        ['\Google\Protobuf\GPBEmpty','decode'],
        $metadata, $options);
    }

    /**
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function BrokerStatus($metadata = [], $options = []) {
        return $this->_clientStreamRequest('/monitor.Monitor/BrokerStatus',
        ['\Google\Protobuf\GPBEmpty','decode'],
        $metadata, $options);
    }

    /**
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function BrokerUplink($metadata = [], $options = []) {
        return $this->_clientStreamRequest('/monitor.Monitor/BrokerUplink',
        ['\Google\Protobuf\GPBEmpty','decode'],
        $metadata, $options);
    }

    /**
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function BrokerDownlink($metadata = [], $options = []) {
        return $this->_clientStreamRequest('/monitor.Monitor/BrokerDownlink',
        ['\Google\Protobuf\GPBEmpty','decode'],
        $metadata, $options);
    }

    /**
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function HandlerStatus($metadata = [], $options = []) {
        return $this->_clientStreamRequest('/monitor.Monitor/HandlerStatus',
        ['\Google\Protobuf\GPBEmpty','decode'],
        $metadata, $options);
    }

    /**
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function HandlerUplink($metadata = [], $options = []) {
        return $this->_clientStreamRequest('/monitor.Monitor/HandlerUplink',
        ['\Google\Protobuf\GPBEmpty','decode'],
        $metadata, $options);
    }

    /**
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function HandlerDownlink($metadata = [], $options = []) {
        return $this->_clientStreamRequest('/monitor.Monitor/HandlerDownlink',
        ['\Google\Protobuf\GPBEmpty','decode'],
        $metadata, $options);
    }

    /**
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function NetworkServerStatus($metadata = [], $options = []) {
        return $this->_clientStreamRequest('/monitor.Monitor/NetworkServerStatus',
        ['\Google\Protobuf\GPBEmpty','decode'],
        $metadata, $options);
    }

}
