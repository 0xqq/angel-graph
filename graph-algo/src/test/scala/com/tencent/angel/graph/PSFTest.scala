package com.tencent.angel.graph

import java.nio.ByteBuffer

import com.tencent.angel.graph.core.psf.common.{PSFGUCtx, PSFMCtx}
import com.tencent.angel.graph.utils.psfConverters._
import com.tencent.angel.ml.matrix.RowType
import com.tencent.angel.spark.context.PSContext
import com.tencent.angel.spark.models.PSMatrix
import com.tencent.angel.utils.WithSONA
import it.unimi.dsi.fastutil.longs._
import org.apache.spark.rdd.RDD
import org.apache.spark.storage.StorageLevel

class PSFTest extends WithSONA {
  var maxId: Long = -1
  var minId: Long = -1

  override def beforeAll(): Unit = {
    super.beforeAll()

  }

  test("pull/push") {
    println("hello world!")
  }
}
