<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: geo/Address.proto

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>Address</code>
 */
class Address extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string first_line = 1;</code>
     */
    private $first_line = '';
    /**
     * Generated from protobuf field <code>string second_line = 2;</code>
     */
    private $second_line = '';
    /**
     * Generated from protobuf field <code>string city = 3;</code>
     */
    private $city = '';
    /**
     * Generated from protobuf field <code>string state = 4;</code>
     */
    private $state = '';
    /**
     * Generated from protobuf field <code>string zipcode = 5;</code>
     */
    private $zipcode = '';
    /**
     * Generated from protobuf field <code>string country = 6;</code>
     */
    private $country = '';

    public function __construct() {
        \GPBMetadata\Geo\Address::initOnce();
        parent::__construct();
    }

    /**
     * Generated from protobuf field <code>string first_line = 1;</code>
     * @return string
     */
    public function getFirstLine()
    {
        return $this->first_line;
    }

    /**
     * Generated from protobuf field <code>string first_line = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setFirstLine($var)
    {
        GPBUtil::checkString($var, True);
        $this->first_line = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string second_line = 2;</code>
     * @return string
     */
    public function getSecondLine()
    {
        return $this->second_line;
    }

    /**
     * Generated from protobuf field <code>string second_line = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setSecondLine($var)
    {
        GPBUtil::checkString($var, True);
        $this->second_line = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string city = 3;</code>
     * @return string
     */
    public function getCity()
    {
        return $this->city;
    }

    /**
     * Generated from protobuf field <code>string city = 3;</code>
     * @param string $var
     * @return $this
     */
    public function setCity($var)
    {
        GPBUtil::checkString($var, True);
        $this->city = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string state = 4;</code>
     * @return string
     */
    public function getState()
    {
        return $this->state;
    }

    /**
     * Generated from protobuf field <code>string state = 4;</code>
     * @param string $var
     * @return $this
     */
    public function setState($var)
    {
        GPBUtil::checkString($var, True);
        $this->state = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string zipcode = 5;</code>
     * @return string
     */
    public function getZipcode()
    {
        return $this->zipcode;
    }

    /**
     * Generated from protobuf field <code>string zipcode = 5;</code>
     * @param string $var
     * @return $this
     */
    public function setZipcode($var)
    {
        GPBUtil::checkString($var, True);
        $this->zipcode = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string country = 6;</code>
     * @return string
     */
    public function getCountry()
    {
        return $this->country;
    }

    /**
     * Generated from protobuf field <code>string country = 6;</code>
     * @param string $var
     * @return $this
     */
    public function setCountry($var)
    {
        GPBUtil::checkString($var, True);
        $this->country = $var;

        return $this;
    }

}
