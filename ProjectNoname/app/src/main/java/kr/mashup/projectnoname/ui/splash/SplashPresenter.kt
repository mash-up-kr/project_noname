package kr.mashup.projectnoname.ui.splash

import kr.mashup.projectnoname.domain.PostContentsUseCase
import java.io.File

class SplashPresenterImpl(
    override val view: SplashView,
    private val postContents: PostContentsUseCase
) : SplashPresenter {

    override fun test(file: File) { //Todo Remove
        postContents.execute(1, arrayOf(file))
            .subscribe({
                view.startIntro()
            }, {
                it.printStackTrace()
            })
    }


}
