package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Swatches: ImageVector
    get() {
        if (_Swatches != null) {
            return _Swatches!!
        }
        _Swatches = ImageVector.Builder(
            name = "Outline.Swatches",
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
                moveTo(6.5f, 21f)
                horizontalLineTo(18f)
                curveToRelative(1.657f, 0f, 3f, -1.398f, 3f, -3.123f)
                curveToRelative(0f, -1.308f, 0.13f, -2.63f, -1.297f, -3.253f)
                moveTo(7.98f, 20.664f)
                lineToRelative(10.287f, -4.67f)
                arcToRelative(3.04f, 3.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.436f, -1.37f)
                moveToRelative(-7.613f, -3.787f)
                lineToRelative(3.013f, -1.718f)
                curveToRelative(1.553f, -0.886f, 3.5f, -0.186f, 4.198f, 1.509f)
                lineToRelative(0.525f, 1.273f)
                arcToRelative(3.23f, 3.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.123f, 2.723f)
                moveToRelative(-9.821f, 3.718f)
                curveToRelative(-0.5f, 1.912f, -2.42f, 3.047f, -4.287f, 2.535f)
                curveToRelative(-1.867f, -0.513f, -2.975f, -2.478f, -2.475f, -4.39f)
                lineTo(6.18f, 5.27f)
                curveToRelative(0.452f, -1.661f, 2.114f, -2.624f, 3.71f, -2.15f)
                lineToRelative(1.17f, 0.348f)
                curveToRelative(1.615f, 0.48f, 2.536f, 2.246f, 2.045f, 3.918f)
                close()
                moveTo(6.5f, 17f)
                lineToRelative(-0.242f, 0.854f)
            }
        }.build()

        return _Swatches!!
    }

@Suppress("ObjectPropertyName")
private var _Swatches: ImageVector? = null
