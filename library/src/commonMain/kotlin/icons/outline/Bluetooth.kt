package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Bluetooth: ImageVector
    get() {
        if (_Bluetooth != null) {
            return _Bluetooth!!
        }
        _Bluetooth = ImageVector.Builder(
            name = "Outline.Bluetooth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(6.5f, 7.678f)
                lineToRelative(10.54f, 8.558f)
                curveToRelative(0.242f, 0.196f, 0.363f, 0.294f, 0.408f, 0.41f)
                curveToRelative(0.04f, 0.104f, 0.042f, 0.216f, 0.004f, 0.32f)
                curveToRelative(-0.042f, 0.117f, -0.16f, 0.218f, -0.396f, 0.42f)
                lineToRelative(-3.57f, 3.05f)
                curveToRelative(-0.432f, 0.37f, -0.649f, 0.556f, -0.833f, 0.564f)
                arcToRelative(0.53f, 0.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.416f, -0.174f)
                curveToRelative(-0.118f, -0.133f, -0.118f, -0.408f, -0.118f, -0.958f)
                verticalLineTo(4.132f)
                curveToRelative(0f, -0.55f, 0f, -0.825f, 0.118f, -0.958f)
                arcTo(0.53f, 0.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.653f, 3f)
                curveToRelative(0.184f, 0.008f, 0.4f, 0.193f, 0.833f, 0.563f)
                lineToRelative(3.603f, 3.08f)
                curveToRelative(0.226f, 0.192f, 0.339f, 0.289f, 0.382f, 0.402f)
                curveToRelative(0.037f, 0.1f, 0.039f, 0.21f, 0.004f, 0.31f)
                curveToRelative(-0.04f, 0.115f, -0.15f, 0.214f, -0.371f, 0.412f)
                lineTo(6.5f, 17.283f)
            }
        }.build()

        return _Bluetooth!!
    }

@Suppress("ObjectPropertyName")
private var _Bluetooth: ImageVector? = null
