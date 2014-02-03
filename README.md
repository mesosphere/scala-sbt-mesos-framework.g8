# Write a Scala Mesos Framework in 7 Steps

This is a [giter8](http://github.com/n8han/giter8) template.  The result of applying this template is a bare-bones [Apache Mesos](http://mesos.apache.org) framework in [Scala](http://scala-lang.org) using [SBT](http://scala-sbt.org) for builds and [Vagrant](http://vagrantup.com) for testing on a singleton cluster.

## Before we start

- You need [git](http://git-scm.com)
- You need [giter8](https://github.com/n8han/giter8)
- You need [SBT](http://scala-sbt.org)
- You need [vagrant](http://vagrantup.com)
- You need [virtual box](https://www.virtualbox.org/wiki/Downloads)

## Procedure

1. Clone this _giter8_ template

        $ g8 mesosphere/scala-sbt-mesos-framework
        package [com.domain]: io.mycompany   
        name [My Mesos Framework]: My Great Framework
        
        Template applied in ./my-great-framework

1. Change into the new project directory

        $ cd my-great-framework

1. Inspect the template output with your favorite editor.  The build definition is in `project/Build.scala` and the framework implementation is in `src/main/scala/`.

1. Edit the framework's configuration file (`src/main/resources/application.conf`) to reflect the master's private IP address on the virtual machine

        io.mycompany {
          mesos {
            master = "10.141.141.10:5050"
          }
        }

1. Create and start a virtual machine running the Mesos master and the Mesos slave

        $ vagrant up

1. Run your new framework with SBT

        $ sbt run

1. Observe STDOUT as your framework registers with the Mesos master and begins receiving resource offers
