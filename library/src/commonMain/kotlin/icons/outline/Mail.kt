package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Mail: ImageVector
    get() {
        if (_Mail != null) {
            return _Mail!!
        }
        _Mail = ImageVector.Builder(
            name = "Outline.Mail",
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
                moveToRelative(2.357f, 7.714f)
                lineToRelative(6.98f, 4.654f)
                curveToRelative(0.963f, 0.641f, 1.444f, 0.962f, 1.964f, 1.087f)
                curveToRelative(0.46f, 0.11f, 0.939f, 0.11f, 1.398f, 0f)
                curveToRelative(0.52f, -0.125f, 1.001f, -0.446f, 1.964f, -1.087f)
                lineToRelative(6.98f, -4.654f)
                moveTo(7.157f, 19.5f)
                horizontalLineToRelative(9.686f)
                curveToRelative(1.68f, 0f, 2.52f, 0f, 3.162f, -0.327f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.31f, -1.311f)
                curveToRelative(0.328f, -0.642f, 0.328f, -1.482f, 0.328f, -3.162f)
                verticalLineTo(9.3f)
                curveToRelative(0f, -1.68f, 0f, -2.52f, -0.327f, -3.162f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.311f, -1.311f)
                curveToRelative(-0.642f, -0.327f, -1.482f, -0.327f, -3.162f, -0.327f)
                horizontalLineTo(7.157f)
                curveToRelative(-1.68f, 0f, -2.52f, 0f, -3.162f, 0.327f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.31f, 1.311f)
                curveToRelative(-0.328f, 0.642f, -0.328f, 1.482f, -0.328f, 3.162f)
                verticalLineToRelative(5.4f)
                curveToRelative(0f, 1.68f, 0f, 2.52f, 0.327f, 3.162f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.311f, 1.311f)
                curveToRelative(0.642f, 0.327f, 1.482f, 0.327f, 3.162f, 0.327f)
            }
        }.build()

        return _Mail!!
    }

@Suppress("ObjectPropertyName")
private var _Mail: ImageVector? = null
