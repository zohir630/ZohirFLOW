package io.github.aedev.flow.ui.components.shared

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import io.github.aedev.flow.R

private const val LOGO_ASPECT = 1158f / 811f

/** The app's logo (full colour). Size it by width. */
@Composable
fun FlowLogo(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.drawable.zohir_logo),
        contentDescription = null,
        contentScale = ContentScale.Fit,
        modifier = modifier.aspectRatio(LOGO_ASPECT),
    )
}
