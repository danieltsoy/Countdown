// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.transit.realtime.gtfs_realtime

/** Metadata about a feed, included in feed messages.
  *
  * @param gtfsRealtimeVersion
  *   Version of the feed specification.
  *   The current version is 2.0.
  * @param timestamp
  *   This timestamp identifies the moment when the content of this feed has been
  *   created (in server time). In POSIX time (i.e., number of seconds since
  *   January 1st 1970 00:00:00 UTC).
  */
@SerialVersionUID(0L)
final case class FeedHeader(
    gtfsRealtimeVersion: _root_.scala.Predef.String,
    incrementality: _root_.scala.Option[com.google.transit.realtime.gtfs_realtime.FeedHeader.Incrementality] = _root_.scala.None,
    timestamp: _root_.scala.Option[_root_.scala.Long] = _root_.scala.None,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet()
    ) extends scalapb.GeneratedMessage with scalapb.Message[FeedHeader] with scalapb.lenses.Updatable[FeedHeader] with _root_.scalapb.ExtendableMessage[FeedHeader] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = gtfsRealtimeVersion
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
      };
      if (incrementality.isDefined) {
        val __value = incrementality.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(2, __value.value)
      };
      if (timestamp.isDefined) {
        val __value = timestamp.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt64Size(3, __value)
      };
      __size += unknownFields.serializedSize
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      
      {
        val __v = gtfsRealtimeVersion
        _output__.writeString(1, __v)
      };
      incrementality.foreach { __v =>
        val __m = __v
        _output__.writeEnum(2, __m.value)
      };
      timestamp.foreach { __v =>
        val __m = __v
        _output__.writeUInt64(3, __m)
      };
      unknownFields.writeTo(_output__)
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.transit.realtime.gtfs_realtime.FeedHeader = {
      var __gtfsRealtimeVersion = this.gtfsRealtimeVersion
      var __incrementality = this.incrementality
      var __timestamp = this.timestamp
      val _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder(this.unknownFields)
      var __requiredFields0: _root_.scala.Long = 0x1L
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __gtfsRealtimeVersion = _input__.readString()
            __requiredFields0 &= 0xfffffffffffffffeL
          case 16 =>
            __incrementality = Option(com.google.transit.realtime.gtfs_realtime.FeedHeader.Incrementality.fromValue(_input__.readEnum()))
          case 24 =>
            __timestamp = Option(_input__.readUInt64())
          case tag => _unknownFields__.parseField(tag, _input__)
        }
      }
      if (__requiredFields0 != 0L) { throw new _root_.com.google.protobuf.InvalidProtocolBufferException("Message missing required fields.") } 
      com.google.transit.realtime.gtfs_realtime.FeedHeader(
          gtfsRealtimeVersion = __gtfsRealtimeVersion,
          incrementality = __incrementality,
          timestamp = __timestamp,
          unknownFields = _unknownFields__.result()
      )
    }
    def withGtfsRealtimeVersion(__v: _root_.scala.Predef.String): FeedHeader = copy(gtfsRealtimeVersion = __v)
    def getIncrementality: com.google.transit.realtime.gtfs_realtime.FeedHeader.Incrementality = incrementality.getOrElse(com.google.transit.realtime.gtfs_realtime.FeedHeader.Incrementality.FULL_DATASET)
    def clearIncrementality: FeedHeader = copy(incrementality = _root_.scala.None)
    def withIncrementality(__v: com.google.transit.realtime.gtfs_realtime.FeedHeader.Incrementality): FeedHeader = copy(incrementality = Option(__v))
    def getTimestamp: _root_.scala.Long = timestamp.getOrElse(0L)
    def clearTimestamp: FeedHeader = copy(timestamp = _root_.scala.None)
    def withTimestamp(__v: _root_.scala.Long): FeedHeader = copy(timestamp = Option(__v))
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => gtfsRealtimeVersion
        case 2 => incrementality.map(_.javaValueDescriptor).orNull
        case 3 => timestamp.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(gtfsRealtimeVersion)
        case 2 => incrementality.map(__e => _root_.scalapb.descriptors.PEnum(__e.scalaValueDescriptor)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => timestamp.map(_root_.scalapb.descriptors.PLong).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.transit.realtime.gtfs_realtime.FeedHeader
}

object FeedHeader extends scalapb.GeneratedMessageCompanion[com.google.transit.realtime.gtfs_realtime.FeedHeader] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.transit.realtime.gtfs_realtime.FeedHeader] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.transit.realtime.gtfs_realtime.FeedHeader = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.transit.realtime.gtfs_realtime.FeedHeader(
      __fieldsMap(__fields.get(0)).asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[_root_.scala.Option[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor]].map(__e => com.google.transit.realtime.gtfs_realtime.FeedHeader.Incrementality.fromValue(__e.getNumber)),
      __fieldsMap.get(__fields.get(2)).asInstanceOf[_root_.scala.Option[_root_.scala.Long]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.transit.realtime.gtfs_realtime.FeedHeader] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.transit.realtime.gtfs_realtime.FeedHeader(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).get.as[_root_.scala.Predef.String],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[_root_.scalapb.descriptors.EnumValueDescriptor]]).map(__e => com.google.transit.realtime.gtfs_realtime.FeedHeader.Incrementality.fromValue(__e.number)),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Long]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = GtfsRealtimeProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = GtfsRealtimeProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 2 => com.google.transit.realtime.gtfs_realtime.FeedHeader.Incrementality
    }
  }
  lazy val defaultInstance = com.google.transit.realtime.gtfs_realtime.FeedHeader(
    gtfsRealtimeVersion = ""
  )
  /** Determines whether the current fetch is incremental.  Currently,
    * DIFFERENTIAL mode is unsupported and behavior is unspecified for feeds
    * that use this mode.  There are discussions on the GTFS Realtime mailing
    * list around fully specifying the behavior of DIFFERENTIAL mode and the
    * documentation will be updated when those discussions are finalized.
    */
  sealed trait Incrementality extends _root_.scalapb.GeneratedEnum {
    type EnumType = Incrementality
    def isFullDataset: _root_.scala.Boolean = false
    def isDifferential: _root_.scala.Boolean = false
    def companion: _root_.scalapb.GeneratedEnumCompanion[Incrementality] = com.google.transit.realtime.gtfs_realtime.FeedHeader.Incrementality
  }
  
  object Incrementality extends _root_.scalapb.GeneratedEnumCompanion[Incrementality] {
    implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[Incrementality] = this
    @SerialVersionUID(0L)
    case object FULL_DATASET extends Incrementality {
      val value = 0
      val index = 0
      val name = "FULL_DATASET"
      override def isFullDataset: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object DIFFERENTIAL extends Incrementality {
      val value = 1
      val index = 1
      val name = "DIFFERENTIAL"
      override def isDifferential: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    final case class Unrecognized(value: _root_.scala.Int) extends Incrementality with _root_.scalapb.UnrecognizedEnum
    
    lazy val values = scala.collection.immutable.Seq(FULL_DATASET, DIFFERENTIAL)
    def fromValue(value: _root_.scala.Int): Incrementality = value match {
      case 0 => FULL_DATASET
      case 1 => DIFFERENTIAL
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = com.google.transit.realtime.gtfs_realtime.FeedHeader.javaDescriptor.getEnumTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = com.google.transit.realtime.gtfs_realtime.FeedHeader.scalaDescriptor.enums(0)
  }
  implicit class FeedHeaderLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.transit.realtime.gtfs_realtime.FeedHeader]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.transit.realtime.gtfs_realtime.FeedHeader](_l) {
    def gtfsRealtimeVersion: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.gtfsRealtimeVersion)((c_, f_) => c_.copy(gtfsRealtimeVersion = f_))
    def incrementality: _root_.scalapb.lenses.Lens[UpperPB, com.google.transit.realtime.gtfs_realtime.FeedHeader.Incrementality] = field(_.getIncrementality)((c_, f_) => c_.copy(incrementality = Option(f_)))
    def optionalIncrementality: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.transit.realtime.gtfs_realtime.FeedHeader.Incrementality]] = field(_.incrementality)((c_, f_) => c_.copy(incrementality = f_))
    def timestamp: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Long] = field(_.getTimestamp)((c_, f_) => c_.copy(timestamp = Option(f_)))
    def optionalTimestamp: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Long]] = field(_.timestamp)((c_, f_) => c_.copy(timestamp = f_))
  }
  final val GTFS_REALTIME_VERSION_FIELD_NUMBER = 1
  final val INCREMENTALITY_FIELD_NUMBER = 2
  final val TIMESTAMP_FIELD_NUMBER = 3
  def of(
    gtfsRealtimeVersion: _root_.scala.Predef.String,
    incrementality: _root_.scala.Option[com.google.transit.realtime.gtfs_realtime.FeedHeader.Incrementality],
    timestamp: _root_.scala.Option[_root_.scala.Long],
    unknownFields: _root_.scalapb.UnknownFieldSet
  ): _root_.com.google.transit.realtime.gtfs_realtime.FeedHeader = _root_.com.google.transit.realtime.gtfs_realtime.FeedHeader(
    gtfsRealtimeVersion,
    incrementality,
    timestamp,
    unknownFields
  )
}
