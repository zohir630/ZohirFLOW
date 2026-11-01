package io.github.aedev.flow.ui.components.donation

import androidx.annotation.StringRes
import io.github.aedev.flow.R

internal const val OPEN_COLLECTIVE_URL = "https://github.com/zohir630"
internal const val PATREON_URL = "https://github.com/zohir630"

internal class CryptoWallet(
    @StringRes val name: Int,
    val ticker: String,
    val address: String,
)

/** The wallets the donations page lists; the donation prompt names the same ones. */
internal val DonationWallets: List<CryptoWallet> = emptyList()
