package org.cbi.scala_for_the_impatient.unit1

import org.specs2.mutable.Specification

class Ex6Test extends Specification {
  "U1 Ex6Test" should {
    "value be equal" in { Ex6.value mustEqual BigInt("179769313486231590772930519078902473361797697894230657273430081157732675805500963132708477322407536021120113879871393357658789768814416622492847430639474124377767893424865485276302219601246094119453082952085005768838150682342462881473913110540827237163350510684586298239947245938479716304835356329624224137216") }
  }
}