package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Rectangle: ImageVector
    get() {
        if (_Rectangle != null) {
            return _Rectangle!!
        }
        _Rectangle = ImageVector.Builder(
            name = "Outline.Rectangle",
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
                moveTo(2.357f, 9.3f)
                curveToRelative(0f, -1.68f, 0f, -2.52f, 0.327f, -3.162f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.311f, -1.311f)
                curveTo(4.637f, 4.5f, 5.477f, 4.5f, 7.157f, 4.5f)
                horizontalLineToRelative(9.686f)
                curveToRelative(1.68f, 0f, 2.52f, 0f, 3.162f, 0.327f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.31f, 1.311f)
                curveToRelative(0.328f, 0.642f, 0.328f, 1.482f, 0.328f, 3.162f)
                verticalLineToRelative(5.4f)
                curveToRelative(0f, 1.68f, 0f, 2.52f, -0.327f, 3.162f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.311f, 1.311f)
                curveToRelative(-0.642f, 0.327f, -1.482f, 0.327f, -3.162f, 0.327f)
                horizontalLineTo(7.157f)
                curveToRelative(-1.68f, 0f, -2.52f, 0f, -3.162f, -0.327f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.31f, -1.311f)
                curveToRelative(-0.328f, -0.642f, -0.328f, -1.482f, -0.328f, -3.162f)
                close()
            }
        }.build()

        return _Rectangle!!
    }

@Suppress("ObjectPropertyName")
private var _Rectangle: ImageVector? = null
