package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Planet: ImageVector
    get() {
        if (_Planet != null) {
            return _Planet!!
        }
        _Planet = ImageVector.Builder(
            name = "Outline.Planet",
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
                moveTo(7.722f, 17.777f)
                arcToRelative(7.3f, 7.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.716f, 1.723f)
                curveToRelative(4.085f, 0f, 7.396f, -3.358f, 7.396f, -7.5f)
                quadToRelative(-0.001f, -0.802f, -0.16f, -1.556f)
                moveTo(7.722f, 17.777f)
                arcTo(7.53f, 7.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.042f, 12f)
                curveToRelative(0f, -4.142f, 3.311f, -7.5f, 7.395f, -7.5f)
                curveToRelative(3.559f, 0f, 6.53f, 2.549f, 7.236f, 5.944f)
                moveTo(7.722f, 17.777f)
                curveToRelative(1.807f, -0.42f, 3.958f, -1.293f, 6.127f, -2.563f)
                curveToRelative(2.524f, -1.478f, 4.577f, -3.202f, 5.825f, -4.77f)
                moveTo(7.722f, 17.777f)
                curveToRelative(-2.246f, 0.52f, -3.963f, 0.34f, -4.528f, -0.654f)
                curveToRelative(-0.583f, -1.024f, 0.182f, -2.688f, 1.849f, -4.458f)
                moveToRelative(14.631f, -2.22f)
                curveToRelative(1.157f, -1.454f, 1.623f, -2.772f, 1.132f, -3.635f)
                curveToRelative(-0.498f, -0.875f, -1.888f, -1.12f, -3.746f, -0.81f)
            }
        }.build()

        return _Planet!!
    }

@Suppress("ObjectPropertyName")
private var _Planet: ImageVector? = null
