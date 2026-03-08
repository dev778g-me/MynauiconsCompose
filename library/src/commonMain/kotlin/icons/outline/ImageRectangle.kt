package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ImageRectangle: ImageVector
    get() {
        if (_ImageRectangle != null) {
            return _ImageRectangle!!
        }
        _ImageRectangle = ImageVector.Builder(
            name = "Outline.ImageRectangle",
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
                moveTo(6f, 9f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
                moveToRelative(14.927f, -0.01f)
                curveToRelative(-6.61f, -0.908f, -11.31f, 4f, -10.927f, 10.51f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 13.066f)
                curveToRelative(2.78f, -0.385f, 5.851f, 1.293f, 7.2f, 3.434f)
            }
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

        return _ImageRectangle!!
    }

@Suppress("ObjectPropertyName")
private var _ImageRectangle: ImageVector? = null
