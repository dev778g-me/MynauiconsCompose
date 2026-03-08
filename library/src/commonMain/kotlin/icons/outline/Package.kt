package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Package: ImageVector
    get() {
        if (_Package != null) {
            return _Package!!
        }
        _Package = ImageVector.Builder(
            name = "Outline.Package",
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
                lineToRelative(-4.5f, -2.33f)
                moveTo(3f, 7.534f)
                lineToRelative(8.269f, -4.28f)
                curveToRelative(0.268f, -0.138f, 0.401f, -0.208f, 0.542f, -0.235f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.378f, 0f)
                curveToRelative(0.14f, 0.027f, 0.274f, 0.097f, 0.541f, 0.235f)
                lineToRelative(3.77f, 1.95f)
                moveTo(3f, 7.534f)
                lineToRelative(4.5f, 2.202f)
                moveToRelative(4.5f, 2.202f)
                lineTo(7.5f, 9.735f)
                moveToRelative(0f, 0f)
                lineToRelative(9f, -4.531f)
                moveToRelative(-9f, 4.531f)
                verticalLineToRelative(2.202f)
            }
        }.build()

        return _Package!!
    }

@Suppress("ObjectPropertyName")
private var _Package: ImageVector? = null
