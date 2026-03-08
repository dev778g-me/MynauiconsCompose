package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Swatches: ImageVector
    get() {
        if (_Swatches != null) {
            return _Swatches!!
        }
        _Swatches = ImageVector.Builder(
            name = "Filled.Swatches",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.456f, 5.073f)
                curveToRelative(0.557f, -2.042f, 2.625f, -3.272f, 4.647f, -2.67f)
                lineToRelative(1.171f, 0.347f)
                curveToRelative(2.034f, 0.605f, 3.152f, 2.804f, 2.55f, 4.848f)
                lineToRelative(-0.49f, 1.666f)
                lineToRelative(1.397f, -0.797f)
                curveToRelative(1.964f, -1.12f, 4.402f, -0.218f, 5.264f, 1.875f)
                lineToRelative(0.524f, 1.274f)
                curveToRelative(0.366f, 0.887f, 0.386f, 1.838f, 0.123f, 2.69f)
                curveToRelative(0.53f, 0.403f, 0.825f, 0.929f, 0.971f, 1.502f)
                curveToRelative(0.15f, 0.587f, 0.144f, 1.248f, 0.139f, 1.795f)
                lineToRelative(-0.002f, 0.274f)
                curveToRelative(0f, 2.11f, -1.65f, 3.873f, -3.75f, 3.873f)
                lineTo(6.56f, 21.75f)
                arcToRelative(4.2f, 4.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.163f, -0.15f)
                curveToRelative(-2.277f, -0.625f, -3.603f, -3.008f, -3.002f, -5.304f)
                lineToRelative(0.002f, -0.007f)
                close()
                moveTo(10.706f, 20.25f)
                lineTo(18f, 20.25f)
                curveToRelative(1.215f, 0f, 2.25f, -1.034f, 2.25f, -2.373f)
                lineToRelative(0.001f, -0.33f)
                curveToRelative(0.004f, -0.556f, 0.006f, -0.986f, -0.091f, -1.368f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.252f, -0.516f)
                curveToRelative(-0.353f, 0.422f, -0.8f, 0.774f, -1.33f, 1.014f)
                close()
                moveTo(10.571f, 18.664f)
                lineTo(17.957f, 15.311f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.082f, -1.034f)
                arcToRelative(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.093f, -2.09f)
                lineToRelative(-0.524f, -1.274f)
                curveToRelative(-0.534f, -1.296f, -1.992f, -1.794f, -3.134f, -1.142f)
                lineToRelative(-2.75f, 1.568f)
                lineToRelative(-2.12f, 7.204f)
                close()
                moveTo(6.705f, 16.278f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.926f, 0.517f)
                lineToRelative(-0.243f, 0.854f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.443f, 0.41f)
                lineToRelative(0.243f, -0.854f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.517f, -0.926f)
            }
        }.build()

        return _Swatches!!
    }

@Suppress("ObjectPropertyName")
private var _Swatches: ImageVector? = null
