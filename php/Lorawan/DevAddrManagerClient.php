<?php
// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.
//
namespace Lorawan;

/**
 * The Device Addresses in the network are issued by the NetworkServer
 */
class DevAddrManagerClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * Get all prefixes that are in use or available
     * @param \Lorawan\PrefixesRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetPrefixes(\Lorawan\PrefixesRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/lorawan.DevAddrManager/GetPrefixes',
        $argument,
        ['\Lorawan\PrefixesResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * Request a device address
     * @param \Lorawan\DevAddrRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetDevAddr(\Lorawan\DevAddrRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/lorawan.DevAddrManager/GetDevAddr',
        $argument,
        ['\Lorawan\DevAddrResponse', 'decode'],
        $metadata, $options);
    }

}
