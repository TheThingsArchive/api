<?php
// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.
//
namespace Discovery;

/**
 * The Discovery service is used to discover services within The Things Network.
 */
class DiscoveryClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * Announce a component to the Discovery server.
     * A call to `Announce` does not processes the `metadata` field, so you can safely leave this field empty.
     * Adding or removing Metadata should be done with the `AddMetadata` and `DeleteMetadata` methods.
     * @param \Discovery\Announcement $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Announce(\Discovery\Announcement $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/discovery.Discovery/Announce',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * Get all announcements for a specific service type
     * @param \Discovery\GetServiceRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetAll(\Discovery\GetServiceRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/discovery.Discovery/GetAll',
        $argument,
        ['\Discovery\AnnouncementsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * Get a specific announcement
     * @param \Discovery\GetRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Get(\Discovery\GetRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/discovery.Discovery/Get',
        $argument,
        ['\Discovery\Announcement', 'decode'],
        $metadata, $options);
    }

    /**
     * Add metadata to an announement
     * @param \Discovery\MetadataRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function AddMetadata(\Discovery\MetadataRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/discovery.Discovery/AddMetadata',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * Delete metadata from an announcement
     * @param \Discovery\MetadataRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function DeleteMetadata(\Discovery\MetadataRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/discovery.Discovery/DeleteMetadata',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Discovery\GetByAppIDRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetByAppID(\Discovery\GetByAppIDRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/discovery.Discovery/GetByAppID',
        $argument,
        ['\Discovery\Announcement', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Discovery\GetByGatewayIDRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetByGatewayID(\Discovery\GetByGatewayIDRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/discovery.Discovery/GetByGatewayID',
        $argument,
        ['\Discovery\Announcement', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Discovery\GetByAppEUIRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetByAppEUI(\Discovery\GetByAppEUIRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/discovery.Discovery/GetByAppEUI',
        $argument,
        ['\Discovery\Announcement', 'decode'],
        $metadata, $options);
    }

}
