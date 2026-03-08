package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Incognito: ImageVector
    get() {
        if (_Incognito != null) {
            return _Incognito!!
        }
        _Incognito = ImageVector.Builder(
            name = "Filled.Incognito",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.58f, 9.405f)
                lineToRelative(0.059f, 0.257f)
                horizontalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(1.362f)
                lineToRelative(0.532f, -2.255f)
                curveToRelative(0.264f, -1.118f, 0.477f, -2.02f, 0.73f, -2.722f)
                curveToRelative(0.261f, -0.727f, 0.593f, -1.323f, 1.144f, -1.779f)
                curveToRelative(0.213f, -0.176f, 0.476f, -0.32f, 0.794f, -0.343f)
                curveToRelative(0.312f, -0.022f, 0.568f, 0.082f, 0.744f, 0.176f)
                curveToRelative(0.136f, 0.072f, 0.28f, 0.17f, 0.393f, 0.247f)
                lineToRelative(0.06f, 0.041f)
                curveToRelative(0.136f, 0.092f, 0.27f, 0.177f, 0.423f, 0.254f)
                curveToRelative(0.647f, 0.324f, 1.506f, 0.103f, 2.521f, -0.393f)
                curveToRelative(0.607f, -0.297f, 1.442f, -0.502f, 2.246f, -0.59f)
                curveToRelative(0.795f, -0.086f, 1.68f, -0.071f, 2.362f, 0.162f)
                curveToRelative(0.598f, 0.204f, 1.003f, 0.478f, 1.294f, 0.923f)
                curveToRelative(0.129f, 0.196f, 0.22f, 0.404f, 0.297f, 0.591f)
                lineToRelative(0.09f, 0.224f)
                curveToRelative(0.047f, 0.12f, 0.094f, 0.239f, 0.157f, 0.385f)
                curveToRelative(0.673f, 1.564f, 1.061f, 3.236f, 1.43f, 4.822f)
                moveTo(6.5f, 13.25f)
                arcToRelative(4.25f, 4.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.189f, 3.528f)
                lineToRelative(0.32f, -0.17f)
                arcToRelative(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.982f, 0f)
                lineToRelative(0.32f, 0.17f)
                quadToRelative(-0.06f, 0.353f, -0.061f, 0.722f)
                arcToRelative(4.25f, 4.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.58f, -2.145f)
                lineToRelative(-0.137f, -0.072f)
                arcToRelative(3.6f, 3.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.386f, 0f)
                lineToRelative(-0.137f, 0.072f)
                arcTo(4.25f, 4.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 13.25f)
            }
        }.build()

        return _Incognito!!
    }

@Suppress("ObjectPropertyName")
private var _Incognito: ImageVector? = null
