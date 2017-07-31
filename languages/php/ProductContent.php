<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: content/ProductContent.proto

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Protobuf type <code>ProductContent</code>
 */
class ProductContent extends \Google\Protobuf\Internal\Message
{
    /**
     * <pre>
     * -- Basic Properties
     * </pre>
     *
     * <code>.Name name = 1;</code>
     */
    private $name = null;
    /**
     * <pre>
     * narrative summary
     * </pre>
     *
     * <code>.Content summary = 2;</code>
     */
    private $summary = null;
    /**
     * <pre>
     * product's brand
     * </pre>
     *
     * <code>.Brand brand = 3;</code>
     */
    private $brand = null;
    /**
     * <pre>
     * -- Media
     * </pre>
     *
     * <code>repeated .MediaItem media = 20;</code>
     */
    private $media;
    /**
     * <pre>
     * -- Extended Attributes
     * </pre>
     *
     * <code>.Content usage = 30;</code>
     */
    private $usage = null;
    /**
     * <pre>
     * dosage advice
     * </pre>
     *
     * <code>.Content dosage = 31;</code>
     */
    private $dosage = null;
    /**
     * <pre>
     * internal advice
     * </pre>
     *
     * <code>.Content advice = 32;</code>
     */
    private $advice = null;

    public function __construct() {
        \GPBMetadata\Content\ProductContent::initOnce();
        parent::__construct();
    }

    /**
     * <pre>
     * -- Basic Properties
     * </pre>
     *
     * <code>.Name name = 1;</code>
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * <pre>
     * -- Basic Properties
     * </pre>
     *
     * <code>.Name name = 1;</code>
     */
    public function setName(&$var)
    {
        GPBUtil::checkMessage($var, \Name::class);
        $this->name = $var;
    }

    /**
     * <pre>
     * narrative summary
     * </pre>
     *
     * <code>.Content summary = 2;</code>
     */
    public function getSummary()
    {
        return $this->summary;
    }

    /**
     * <pre>
     * narrative summary
     * </pre>
     *
     * <code>.Content summary = 2;</code>
     */
    public function setSummary(&$var)
    {
        GPBUtil::checkMessage($var, \Content::class);
        $this->summary = $var;
    }

    /**
     * <pre>
     * product's brand
     * </pre>
     *
     * <code>.Brand brand = 3;</code>
     */
    public function getBrand()
    {
        return $this->brand;
    }

    /**
     * <pre>
     * product's brand
     * </pre>
     *
     * <code>.Brand brand = 3;</code>
     */
    public function setBrand(&$var)
    {
        GPBUtil::checkMessage($var, \Brand::class);
        $this->brand = $var;
    }

    /**
     * <pre>
     * -- Media
     * </pre>
     *
     * <code>repeated .MediaItem media = 20;</code>
     */
    public function getMedia()
    {
        return $this->media;
    }

    /**
     * <pre>
     * -- Media
     * </pre>
     *
     * <code>repeated .MediaItem media = 20;</code>
     */
    public function setMedia(&$var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \MediaItem::class);
        $this->media = $arr;
    }

    /**
     * <pre>
     * -- Extended Attributes
     * </pre>
     *
     * <code>.Content usage = 30;</code>
     */
    public function getUsage()
    {
        return $this->usage;
    }

    /**
     * <pre>
     * -- Extended Attributes
     * </pre>
     *
     * <code>.Content usage = 30;</code>
     */
    public function setUsage(&$var)
    {
        GPBUtil::checkMessage($var, \Content::class);
        $this->usage = $var;
    }

    /**
     * <pre>
     * dosage advice
     * </pre>
     *
     * <code>.Content dosage = 31;</code>
     */
    public function getDosage()
    {
        return $this->dosage;
    }

    /**
     * <pre>
     * dosage advice
     * </pre>
     *
     * <code>.Content dosage = 31;</code>
     */
    public function setDosage(&$var)
    {
        GPBUtil::checkMessage($var, \Content::class);
        $this->dosage = $var;
    }

    /**
     * <pre>
     * internal advice
     * </pre>
     *
     * <code>.Content advice = 32;</code>
     */
    public function getAdvice()
    {
        return $this->advice;
    }

    /**
     * <pre>
     * internal advice
     * </pre>
     *
     * <code>.Content advice = 32;</code>
     */
    public function setAdvice(&$var)
    {
        GPBUtil::checkMessage($var, \Content::class);
        $this->advice = $var;
    }

}

