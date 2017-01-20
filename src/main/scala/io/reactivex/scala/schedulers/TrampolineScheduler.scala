package io.reactivex.scala.schedulers

import io.reactivex.scala.Scheduler
import rx.lang.scala.Scheduler

object TrampolineScheduler {
  /**
   * [[rx.lang.scala.Scheduler]] that queues work on the current thread to be executed after the current work completes.
   */
  def apply(): TrampolineScheduler =  {
    new TrampolineScheduler(rx.schedulers.Schedulers.trampoline())
  }
}

class TrampolineScheduler private[scala] (val asJavaScheduler: rx.Scheduler)
  extends Scheduler {}
