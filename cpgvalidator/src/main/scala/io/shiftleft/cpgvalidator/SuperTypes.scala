package io.shiftleft.cpgvalidator

import io.shiftleft.codepropertygraph.generated.NodeTypes

object SuperTypes {
  val Expression = List(
    NodeTypes.BLOCK,
    NodeTypes.CALL,
    NodeTypes.IDENTIFIER,
    NodeTypes.LITERAL,
    NodeTypes.METHOD_REF,
    NodeTypes.RETURN,
    NodeTypes.UNKNOWN,
  )
}
