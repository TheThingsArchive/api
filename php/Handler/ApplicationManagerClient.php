<?php
// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.
//
namespace Handler;

/**
 * ApplicationManager manages application and device registrations on the Handler
 *
 * To protect our quality of service, you can make up to 5000 calls to the
 * ApplicationManager API per hour. Once you go over the rate limit, you will
 * receive an error response.
 */
class ApplicationManagerClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * Applications should first be registered to the Handler with the `RegisterApplication` method
     * @param \Handler\ApplicationIdentifier $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function RegisterApplication(\Handler\ApplicationIdentifier $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/handler.ApplicationManager/RegisterApplication',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * GetApplication returns the application with the given identifier (app_id)
     * @param \Handler\ApplicationIdentifier $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetApplication(\Handler\ApplicationIdentifier $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/handler.ApplicationManager/GetApplication',
        $argument,
        ['\Handler\Application', 'decode'],
        $metadata, $options);
    }

    /**
     * SetApplication updates the settings for the application. All fields must be supplied.
     * @param \Handler\Application $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function SetApplication(\Handler\Application $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/handler.ApplicationManager/SetApplication',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * DeleteApplication deletes the application with the given identifier (app_id)
     * @param \Handler\ApplicationIdentifier $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function DeleteApplication(\Handler\ApplicationIdentifier $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/handler.ApplicationManager/DeleteApplication',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * GetDevice returns the device with the given identifier (app_id and dev_id)
     * @param \Handler\DeviceIdentifier $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetDevice(\Handler\DeviceIdentifier $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/handler.ApplicationManager/GetDevice',
        $argument,
        ['\Handler\Device', 'decode'],
        $metadata, $options);
    }

    /**
     * SetDevice creates or updates a device. All fields must be supplied.
     * @param \Handler\Device $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function SetDevice(\Handler\Device $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/handler.ApplicationManager/SetDevice',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * DeleteDevice deletes the device with the given identifier (app_id and dev_id)
     * @param \Handler\DeviceIdentifier $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function DeleteDevice(\Handler\DeviceIdentifier $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/handler.ApplicationManager/DeleteDevice',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * GetDevicesForApplication returns all devices that belong to the application with the given identifier (app_id)
     * @param \Handler\ApplicationIdentifier $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetDevicesForApplication(\Handler\ApplicationIdentifier $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/handler.ApplicationManager/GetDevicesForApplication',
        $argument,
        ['\Handler\DeviceList', 'decode'],
        $metadata, $options);
    }

    /**
     * DryUplink simulates processing a downlink message and returns the result
     * @param \Handler\DryDownlinkMessage $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function DryDownlink(\Handler\DryDownlinkMessage $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/handler.ApplicationManager/DryDownlink',
        $argument,
        ['\Handler\DryDownlinkResult', 'decode'],
        $metadata, $options);
    }

    /**
     * DryUplink simulates processing an uplink message and returns the result
     * @param \Handler\DryUplinkMessage $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function DryUplink(\Handler\DryUplinkMessage $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/handler.ApplicationManager/DryUplink',
        $argument,
        ['\Handler\DryUplinkResult', 'decode'],
        $metadata, $options);
    }

    /**
     * SimulateUplink simulates an uplink message
     * @param \Handler\SimulatedUplinkMessage $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function SimulateUplink(\Handler\SimulatedUplinkMessage $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/handler.ApplicationManager/SimulateUplink',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

}
