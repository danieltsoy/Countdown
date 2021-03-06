// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.transit.realtime.nyc_subway

/** NYCT Subway extensions for the stop time update
  *
  * @param scheduledTrack
  *   Provides the planned station arrival track. The following is the Manhattan
  *   track configurations:
  *   1: southbound local
  *   2: southbound express
  *   3: northbound express
  *   4: northbound local
  *  
  *   In the Bronx (except Dyre Ave line)
  *   M: bi-directional express (in the AM express to Manhattan, in the PM
  *   express away).
  *  
  *   The Dyre Ave line is configured:
  *   1: southbound
  *   2: northbound
  *   3: bi-directional
  * @param actualTrack
  *   This is the actual track that the train is operating on and can be used to
  *   determine if a train is operating according to its current schedule
  *   (plan).
  *   
  *   The actual track is known only shortly before the train reaches a station,
  *   typically not before it leaves the previous station. Therefore, the NYCT
  *   feed sets this field only for the first station of the remaining trip.
  *   
  *   Different actual and scheduled track is the result of manually rerouting a
  *   train off it scheduled path.  When this occurs, prediction data may become
  *   unreliable since the train is no longer operating in accordance to its
  *   schedule.  The rules engine for the 'countdown' clocks will remove this
  *   train from all schedule stations.
  */
@SerialVersionUID(0L)
final case class NyctStopTimeUpdate(
    scheduledTrack: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    actualTrack: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None
    ) extends scalapb.GeneratedMessage with scalapb.Message[NyctStopTimeUpdate] with scalapb.lenses.Updatable[NyctStopTimeUpdate] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (scheduledTrack.isDefined) {
        val __value = scheduledTrack.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
      };
      if (actualTrack.isDefined) {
        val __value = actualTrack.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
      };
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
      scheduledTrack.foreach { __v =>
        val __m = __v
        _output__.writeString(1, __m)
      };
      actualTrack.foreach { __v =>
        val __m = __v
        _output__.writeString(2, __m)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.transit.realtime.nyc_subway.NyctStopTimeUpdate = {
      var __scheduledTrack = this.scheduledTrack
      var __actualTrack = this.actualTrack
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __scheduledTrack = Option(_input__.readString())
          case 18 =>
            __actualTrack = Option(_input__.readString())
          case tag => _input__.skipField(tag)
        }
      }
      com.google.transit.realtime.nyc_subway.NyctStopTimeUpdate(
          scheduledTrack = __scheduledTrack,
          actualTrack = __actualTrack
      )
    }
    def getScheduledTrack: _root_.scala.Predef.String = scheduledTrack.getOrElse("")
    def clearScheduledTrack: NyctStopTimeUpdate = copy(scheduledTrack = _root_.scala.None)
    def withScheduledTrack(__v: _root_.scala.Predef.String): NyctStopTimeUpdate = copy(scheduledTrack = Option(__v))
    def getActualTrack: _root_.scala.Predef.String = actualTrack.getOrElse("")
    def clearActualTrack: NyctStopTimeUpdate = copy(actualTrack = _root_.scala.None)
    def withActualTrack(__v: _root_.scala.Predef.String): NyctStopTimeUpdate = copy(actualTrack = Option(__v))
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => scheduledTrack.orNull
        case 2 => actualTrack.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => scheduledTrack.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => actualTrack.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.transit.realtime.nyc_subway.NyctStopTimeUpdate
}

object NyctStopTimeUpdate extends scalapb.GeneratedMessageCompanion[com.google.transit.realtime.nyc_subway.NyctStopTimeUpdate] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.transit.realtime.nyc_subway.NyctStopTimeUpdate] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.transit.realtime.nyc_subway.NyctStopTimeUpdate = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.transit.realtime.nyc_subway.NyctStopTimeUpdate(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[_root_.scala.Option[_root_.scala.Predef.String]],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[_root_.scala.Option[_root_.scala.Predef.String]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.transit.realtime.nyc_subway.NyctStopTimeUpdate] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.transit.realtime.nyc_subway.NyctStopTimeUpdate(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = NycSubwayProto.javaDescriptor.getMessageTypes.get(3)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = NycSubwayProto.scalaDescriptor.messages(3)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.transit.realtime.nyc_subway.NyctStopTimeUpdate(
  )
  implicit class NyctStopTimeUpdateLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.transit.realtime.nyc_subway.NyctStopTimeUpdate]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.transit.realtime.nyc_subway.NyctStopTimeUpdate](_l) {
    def scheduledTrack: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getScheduledTrack)((c_, f_) => c_.copy(scheduledTrack = Option(f_)))
    def optionalScheduledTrack: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.scheduledTrack)((c_, f_) => c_.copy(scheduledTrack = f_))
    def actualTrack: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getActualTrack)((c_, f_) => c_.copy(actualTrack = Option(f_)))
    def optionalActualTrack: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.actualTrack)((c_, f_) => c_.copy(actualTrack = f_))
  }
  final val SCHEDULED_TRACK_FIELD_NUMBER = 1
  final val ACTUAL_TRACK_FIELD_NUMBER = 2
  def of(
    scheduledTrack: _root_.scala.Option[_root_.scala.Predef.String],
    actualTrack: _root_.scala.Option[_root_.scala.Predef.String]
  ): _root_.com.google.transit.realtime.nyc_subway.NyctStopTimeUpdate = _root_.com.google.transit.realtime.nyc_subway.NyctStopTimeUpdate(
    scheduledTrack,
    actualTrack
  )
}
