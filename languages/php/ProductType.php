<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: base/ProductType.proto

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * <pre>
 * -- Product Type: Top-level -- //
 * </pre>
 *
 * Protobuf type <code>ProductType</code>
 */
class ProductType extends \Google\Protobuf\Internal\Message
{
    /**
     * <code>.ProductKind kind = 1;</code>
     */
    private $kind = 0;

    public function __construct() {
        \GPBMetadata\Base\ProductType::initOnce();
        parent::__construct();
    }

    /**
     * <code>.ProductKind kind = 1;</code>
     */
    public function getKind()
    {
        return $this->kind;
    }

    /**
     * <code>.ProductKind kind = 1;</code>
     */
    public function setKind($var)
    {
        GPBUtil::checkEnum($var, \ProductKind::class);
        $this->kind = $var;
    }

}

