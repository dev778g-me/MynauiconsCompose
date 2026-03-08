package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Box: ImageVector
    get() {
        if (_Box != null) {
            return _Box!!
        }
        _Box = ImageVector.Builder(
            name = "Outline.Box",
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
                moveToRelative(12f, 21f)
                lineToRelative(8.131f, -4.208f)
                curveToRelative(0.316f, -0.164f, 0.474f, -0.245f, 0.589f, -0.366f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.226f, -0.373f)
                curveToRelative(0.054f, -0.159f, 0.054f, -0.336f, 0.054f, -0.692f)
                verticalLineTo(7.533f)
                moveTo(12f, 21f)
                lineToRelative(-8.131f, -4.208f)
                curveToRelative(-0.316f, -0.164f, -0.474f, -0.245f, -0.589f, -0.366f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.226f, -0.373f)
                curveTo(3f, 15.894f, 3f, 15.716f, 3f, 15.359f)
                verticalLineTo(7.533f)
                moveTo(12f, 21f)
                verticalLineToRelative(-9.063f)
                moveToRelative(9f, -4.404f)
                lineToRelative(-9f, 4.404f)
                moveToRelative(9f, -4.404f)
                lineToRelative(-8.27f, -4.28f)
                curveToRelative(-0.267f, -0.138f, -0.4f, -0.208f, -0.541f, -0.235f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.378f, 0f)
                curveToRelative(-0.14f, 0.027f, -0.274f, 0.097f, -0.542f, 0.235f)
                lineTo(3f, 7.533f)
                moveToRelative(0f, 0f)
                lineToRelative(9f, 4.404f)
            }
        }.build()

        return _Box!!
    }

@Suppress("ObjectPropertyName")
private var _Box: ImageVector? = null
