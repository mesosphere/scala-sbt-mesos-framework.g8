package $package$.executor

import $package$.Logging

import org.apache.mesos.{ Executor, ExecutorDriver }
import org.apache.mesos.Protos._

import java.util.{ List => JList }
import scala.collection.JavaConversions._

class $name;format="Camel"$Executor extends Executor with Logging {

  /**
    * Invoked once the executor driver has been able to successfully
    * connect with Mesos. In particular, a scheduler can pass some
    * data to it's executors through the ExecutorInfo.data
    * field.
    */
  def registered(
    driver: ExecutorDriver,
    executorInfo: ExecutorInfo,
    frameworkInfo: FrameworkInfo,
    slaveInfo: SlaveInfo): Unit = {
    log.info("Executor.registered")
  }

  /**
    * Invoked when the executor re-registers with a restarted slave.
    */
  def reregistered(
    driver: ExecutorDriver,
    slaveInfo: SlaveInfo): Unit = {
    log.info("Executor.reregistered")
  }

  /**
    * Invoked when the executor becomes "disconnected" from the slave
    * (e.g., the slave is being restarted due to an upgrade).
    */
  def disconnected(driver: ExecutorDriver): Unit = {
    log.info("Executor.disconnected")
  }

  /**
    * Invoked when a task has been launched on this executor (initiated
    * via Scheduler.launchTasks. Note that this task can be
    * realized with a thread, a process, or some simple computation,
    * however, no other callbacks will be invoked on this executor
    * until this callback has returned.
    */
  def launchTask(driver: ExecutorDriver, task: TaskInfo): Unit = {
    log.info("Executor.launchTask")
  }

  /**
    * Invoked when a task running within this executor has been killed
    * (via SchedulerDriver.killTask). Note that no status
    * update will be sent on behalf of the executor, the executor is
    * responsible for creating a new TaskStatus (i.e., with
    * TASK_KILLED) and invoking ExecutorDriver.sendStatusUpdate.
    */
  def killTask(driver: ExecutorDriver, taskId: TaskID): Unit = {
    log.info("Executor.killTask")
  }

  /**
    * Invoked when a framework message has arrived for this
    * executor. These messages are best effort; do not expect a
    * framework message to be retransmitted in any reliable fashion.
    */
  def frameworkMessage(driver: ExecutorDriver, data: Array[Byte]): Unit = {
    log.info("Executor.frameworkMessage")
  }

  /**
    * Invoked when the executor should terminate all of it's currently
    * running tasks. Note that after a Mesos has determined that an
    * executor has terminated any tasks that the executor did not send
    * terminal status updates for (e.g., TASK_KILLED, TASK_FINISHED,
    * TASK_FAILED, etc) a TASK_LOST status update will be created.
    */
  def shutdown(driver: ExecutorDriver): Unit = {
    log.info("Executor.shutdown")
  }

  /**
    * Invoked when a fatal error has occured with the executor and/or
    * executor driver. The driver will be aborted BEFORE invoking this
    * callback.
    */
  def error(driver: ExecutorDriver, message: String): Unit = {
    log.info("Executor.error")
  }

}