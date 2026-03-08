package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Cloudy: ImageVector
    get() {
        if (_Cloudy != null) {
            return _Cloudy!!
        }
        _Cloudy = ImageVector.Builder(
            name = "Outline.Cloudy",
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
                moveTo(19.631f, 13.751f)
                arcToRelative(6.6f, 6.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.333f, -0.701f)
                arcToRelative(6.3f, 6.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.276f, -0.437f)
                curveToRelative(-1.572f, -6.12f, -7.37f, -6.065f, -11f, -3.381f)
                moveToRelative(14.61f, 4.519f)
                curveToRelative(2.153f, 1.474f, 3.14f, 4.107f, 0.646f, 6.246f)
                curveToRelative(-0.91f, 0.78f, -2.245f, 1.003f, -3.406f, 1.003f)
                horizontalLineTo(8.026f)
                arcToRelative(5.4f, 5.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.15f, -1.95f)
                curveTo(0.561f, 15.31f, 2.08f, 11.409f, 5.021f, 9.233f)
                moveToRelative(14.61f, 4.519f)
                curveToRelative(0.404f, -0.127f, 0.783f, -0.31f, 1.1f, -0.568f)
                curveToRelative(3.167f, -2.57f, -0.183f, -6.017f, -3.662f, -6.017f)
                curveTo(15.003f, -0.45f, 4.453f, 3.671f, 5.022f, 9.232f)
            }
        }.build()

        return _Cloudy!!
    }

@Suppress("ObjectPropertyName")
private var _Cloudy: ImageVector? = null
