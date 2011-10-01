package hooks.test

import org.scalatest.{Spec,GivenWhenThen,FeatureSpec}
import org.scalatest.matchers.{ShouldMatchers,MustMatchers}
import hooks._

//  features
object FeatureA extends Feature {
  val name = "A"
  override def depend = List(FeatureP, PluginNu, PluginOmicron)
  def init(implicit c: PluginContextBuilder) { }
}

object FeatureB extends Feature {
  val name = "B"
  override def depend = Nil //List(Plugin1, Plugin2, Plugin3)
  def init(implicit c: PluginContextBuilder) { }
}

object FeatureC extends Feature {
  val name = "C"
  override def depend = Nil //List(Plugin1, Plugin2, Plugin3)
  def init(implicit c: PluginContextBuilder) { }
}

object FeatureD extends Feature {
  val name = "D"
  override def depend = List(FeatureF, PluginAlpha, PluginKappa)
  def init(implicit c: PluginContextBuilder) { }
}

object FeatureE extends Feature {
  val name = "E"
  override def depend = Nil //List(Plugin1, Plugin2, Plugin3)
  def init(implicit c: PluginContextBuilder) { }
}

object FeatureF extends Feature {
  val name = "F"
  override def depend = List(FeatureZ, PluginNu, PluginLambda)
  def init(implicit c: PluginContextBuilder) { }
}

object FeatureG extends Feature {
  val name = "G"
  override def depend = Nil //List(Plugin1, Plugin2, Plugin3)
  def init(implicit c: PluginContextBuilder) { }
}

object FeatureH extends Feature {
  val name = "H"
  override def depend = Nil //List(Plugin1, Plugin2, Plugin3)
  def init(implicit c: PluginContextBuilder) { }
}

object FeatureI extends Feature {
  val name = "I"
  override def depend = Nil //List(Plugin1, Plugin2, Plugin3)
  def init(implicit c: PluginContextBuilder) { }
}

object FeatureJ extends Feature {
  val name = "J"
  override def depend = List(FeatureR, PluginEpsilon, PluginZeta)
  def init(implicit c: PluginContextBuilder) { }
}

object FeatureK extends Feature {
  val name = "K"
  override def depend = List(FeatureZ, PluginDelta, PluginOmicron)
  def init(implicit c: PluginContextBuilder) { }
}

object FeatureL extends Feature {
  val name = "L"
  override def depend = Nil //List(Plugin1, Plugin2, Plugin3)
  def init(implicit c: PluginContextBuilder) { }
}

object FeatureM extends Feature {
  val name = "M"
  override def depend = Nil //List(Plugin1, Plugin2, Plugin3)
  def init(implicit c: PluginContextBuilder) { }
}

object FeatureN extends Feature {
  val name = "N"
  override def depend = Nil //List(Plugin1, Plugin2, Plugin3)
  def init(implicit c: PluginContextBuilder) { }
}

object FeatureO extends Feature {
  val name = "O"
  override def depend = Nil //List(Plugin1, Plugin2, Plugin3)
  def init(implicit c: PluginContextBuilder) { }
}

object FeatureP extends Feature {
  val name = "P"
  override def depend = List(FeatureF, PluginAlpha, PluginOmega)
  def init(implicit c: PluginContextBuilder) { }
}

object FeatureQ extends Feature {
  val name = "Q"
  override def depend = Nil //List(Plugin1, Plugin2, Plugin3)
  def init(implicit c: PluginContextBuilder) { }
}

object FeatureR extends Feature {
  val name = "R"
  override def depend = List(FeatureZ, PluginPi, PluginKappa)
  def init(implicit c: PluginContextBuilder) { }
}

object FeatureS extends Feature {
  val name = "S"
  override def depend = Nil //List(Plugin1, Plugin2, Plugin3)
  def init(implicit c: PluginContextBuilder) { }
}

object FeatureT extends Feature {
  val name = "T"
  override def depend = List(FeatureV, PluginMu, PluginNu)
  def init(implicit c: PluginContextBuilder) { }
}

object FeatureU extends Feature {
  val name = "U"
  override def depend = Nil //List(Plugin1, Plugin2, Plugin3)
  def init(implicit c: PluginContextBuilder) { }
}

object FeatureV extends Feature {
  val name = "V"
  override def depend = List(FeatureP, PluginDelta, PluginTheta)
  def init(implicit c: PluginContextBuilder) { }
}

object FeatureW extends Feature {
  val name = "W"
  override def depend = Nil //List(Plugin1, Plugin2, Plugin3)
  def init(implicit c: PluginContextBuilder) { }
}

object FeatureX extends Feature {
  val name = "X"
  override def depend = Nil //List(Plugin1, Plugin2, Plugin3)
  def init(implicit c: PluginContextBuilder) { }
}

object FeatureY extends Feature {
  val name = "Y"
  override def depend = Nil //List(Plugin1, Plugin2, Plugin3)
  def init(implicit c: PluginContextBuilder) { }
}

object FeatureZ extends Feature {
  val name = "Z"
  override def depend = List(FeatureJ, PluginOmicron, PluginOmega)
  def init(implicit c: PluginContextBuilder) { }
}

object BadFeature extends Feature {
  def name = "Bad Feature"
  override def depend = Nil
  def init(implicit c: PluginContextBuilder) {
    throw new UnsupportedOperationException("Bad Feature! Should never reach this!")
  }
}

//  plugins
object PluginAlpha extends Plugin {
  def name = "α"
  override def depend = List(FeatureK, PluginDelta, PluginOmega)
  def init(implicit c: PluginContextBuilder) { }
}

object PluginBeta extends Plugin {
  def name = "β"
  override def depend = Nil
  def init(implicit c: PluginContextBuilder) { }
}

object PluginGamma extends Plugin {
  def name = "γ"
  override def depend = Nil
  def init(implicit c: PluginContextBuilder) { }
}

object PluginDelta extends Plugin {
  def name = "δ"
  override def depend = List(FeatureX, PluginLambda, PluginRho)
  def init(implicit c: PluginContextBuilder) { }
}

object PluginEpsilon extends Plugin {
  def name = "ε"
  override def depend = List(FeatureZ, PluginGamma, PluginKappa)
  def init(implicit c: PluginContextBuilder) { }
}

object PluginZeta extends Plugin {
  def name = "ζ"
  override def depend = List(FeatureQ, PluginTheta, PluginPhi)
  def init(implicit c: PluginContextBuilder) { }
}

object PluginEta extends Plugin {
  def name = "η"
  override def depend = Nil
  def init(implicit c: PluginContextBuilder) { }
}

object PluginTheta extends Plugin {
  def name = "θ"
  override def depend = List(FeatureT, PluginPhi, PluginRho)
  def init(implicit c: PluginContextBuilder) { }
}

object PluginIota extends Plugin {
  def name = "ι"
  override def depend = Nil
  def init(implicit c: PluginContextBuilder) { }
}

object PluginKappa extends Plugin {
  def name = "κ"
  override def depend = List(FeatureJ, PluginMu, PluginPi)
  def init(implicit c: PluginContextBuilder) { }
}

object PluginLambda extends Plugin {
  def name = "λ"
  override def depend = List(FeatureQ, PluginGamma, PluginLambda)
  def init(implicit c: PluginContextBuilder) { }
}

object PluginMu extends Plugin {
  def name = "μ"
  override def depend = List(FeatureV, PluginRho, PluginAlpha)
  def init(implicit c: PluginContextBuilder) { }
}

object PluginNu extends Plugin {
  def name = "ν"
  override def depend = List(FeatureS, PluginAlpha, PluginZeta)
  def init(implicit c: PluginContextBuilder) { }
}

object PluginXi extends Plugin {
  def name = "ξ"
  override def depend = Nil
  def init(implicit c: PluginContextBuilder) { }
}

object PluginOmicron extends Plugin {
  def name = "ο"
  override def depend = List(FeatureA, PluginGamma, PluginZeta)
  def init(implicit c: PluginContextBuilder) { }
}

object PluginPi extends Plugin {
  def name = "π"
  override def depend = List(FeatureP, PluginGamma, PluginDelta)
  def init(implicit c: PluginContextBuilder) { }
}

object PluginRho extends Plugin {
  def name = "ρ"
  override def depend = List(FeatureQ, PluginSigma, PluginKappa)
  def init(implicit c: PluginContextBuilder) { }
}

object PluginSigma extends Plugin {
  def name = "σ"
  override def depend = Nil
  def init(implicit c: PluginContextBuilder) { }
}

object PluginTau extends Plugin {
  def name = "τ"
  override def depend = Nil
  def init(implicit c: PluginContextBuilder) { }
}

object PluginUpsilon extends Plugin {
  def name = "υ"
  override def depend = Nil
  def init(implicit c: PluginContextBuilder) { }
}

object PluginPhi extends Plugin {
  def name = "φ"
  override def depend = Nil
  def init(implicit c: PluginContextBuilder) { }
}

object PluginChi extends Plugin {
  def name = "χ"
  override def depend = Nil
  def init(implicit c: PluginContextBuilder) { }
}

object PluginPsi extends Plugin {
  def name = "ψ"
  override def depend = Nil
  def init(implicit c: PluginContextBuilder) { }
}

object PluginOmega extends Plugin {
  def name = "ω"
  override def depend = List(FeatureK, PluginSigma, PluginAlpha)
  def init(implicit c: PluginContextBuilder) { }
}

class LargeSpec extends FeatureSpec with GivenWhenThen with MustMatchers {
  //  Test Hooks
  
  val actionHookKA = ActionHook.simple("か ka")
  val actionHookKI = ActionHook[String]("き ki")
  val actionHookKU = ActionHook[(Int, Int)]("く ku")
  val actionHookKE = ActionHook.simple("け ke")
  val actionHookKO = ActionHook.simple("こ ko")
  
  val filterHookSA = FilterHook[String]("さ sa")
  val filterHookSHI = FilterHook[Int]("し shi")
  val filterHookSU = FilterHook[Int, String]("す su")
  val filterHookSE = FilterHook[Int, String]("せ se")
  val filterHookSO = FilterHook[String]("そ so")
  
  val bufferHookTA = BufferHook("た ta")
  val bufferHookCHI = BufferHook("ち chi")
  val bufferHookTSU = BufferHook("つ tsu")
  val bufferHookTE = BufferHook("て te")
  val bufferHookTO = BufferHook("と to")
  
  val guardHookNA = GuardHook[Int]("な na")
  val guardHookNI = GuardHook[String]("に ni")
  val guardHookNU = GuardHook[Plugin]("ぬ nu")
  val guardHookNE = GuardHook[String, String]("ね ne")
  val guardHookNO = GuardHook[Int]("の no")


  //  Configuration
  val allFeatures = List(FeatureA, FeatureB, FeatureC, FeatureD, FeatureE, FeatureF,
        FeatureG, FeatureH, FeatureI, FeatureJ, FeatureK, FeatureL, FeatureM,
        FeatureN, FeatureO, FeatureP, FeatureQ, FeatureR, FeatureS, FeatureT,
        FeatureU, FeatureV, FeatureW, FeatureX, FeatureY, FeatureZ)
  val reqFeatures = List(FeatureA, FeatureJ, FeatureR, FeatureZ)
  val desiredFeatures = List(FeatureD, FeatureK, FeatureT)
  val forbiddenFeatures = List(FeatureQ, FeatureU, FeatureX)
  
  val permittedFeatures = allFeatures.diff(forbiddenFeatures)
  val expectedFeatures = List(FeatureA, FeatureD, FeatureJ, FeatureK, FeatureR,
        FeatureT, FeatureZ, FeatureS)
  val expectedPlugins = List(PluginAlpha, PluginDelta, PluginEpsilon, PluginZeta,
        PluginTheta, PluginKappa, PluginLambda, PluginMu, PluginNu, PluginOmicron,
        PluginPi, PluginOmega, PluginRho, PluginGamma, PluginPhi, PluginSigma)
    
  case class SecurityToken(forbidden: List[Plugin])
  val securityToken = SecurityToken(forbiddenFeatures)
  
  def guardFunction(plugin: Plugin)(token: Option[Any]) = {
    token match {
      case Some(SecurityToken(forbidden)) =>
        !forbidden.contains(plugin)
      case _ => true
    }
  }
  
  
  //  Utility
  def report(plugins: List[Plugin], label: String) = {
    plugins.length+" "+label+": "+plugins.sortBy(_.name).map(_.name).mkString(", ")
  }
  
  
  //  Version 2
  feature("A large system") {
    scenario("register all features") {
      val repo = PluginRepository()
      repo.register(allFeatures: _*)

      info(report(repo.features, "features"))
      //for (f <- allFeatures)
      //  repo should have ('feature
      assert(repo.hasFeatures(allFeatures: _*))
    }
    
    scenario("require features") {
      val repo = PluginRepository()      
      repo.require(reqFeatures: _*)
      
      info(report(repo.features, "features"))
      info(report(repo.requiredFeatures, "required"))
      assert(repo.hasFeatures(reqFeatures: _*))
      assert(repo.isRequired(reqFeatures: _*))
    }
    
    scenario("install a guard") {
      val repo = PluginRepository()
      repo.register(allFeatures: _*)
      repo.require(reqFeatures: _*)
      repo.securityGuard.registerGuard(guardFunction _)
      assert(repo.hasFeatures(permittedFeatures: _*))
    }
    
    scenario("create a context") {
      val repo = PluginRepository()
      repo.register(allFeatures: _*)
      repo.require(reqFeatures: _*)
      repo.securityGuard.registerGuard(guardFunction _)
      val context = repo.makeContext(desiredFeatures, securityToken)

      info(report(permittedFeatures, "permitted features"))
      info(report(context.features, "features"))
      info(report(context.plugins.diff(context.features), "plugins"))
      val req = reqFeatures.diff(forbiddenFeatures)
      val des = desiredFeatures.diff(forbiddenFeatures)
      assert(req.forall(f => context.hasFeature(f)))
      assert(des.forall(f => context.hasFeature(f)))
      
      assert(expectedFeatures.forall(f => context.hasFeature(f)))
      assert(expectedPlugins.forall(p => context.hasPlugin(p)))
      
      assert(context.features.forall(f => permittedFeatures.contains(f)))
      //context.plugins.length must equal(expectedFeatures.length + expectedPlugins.length)
    }
  }
 


}
