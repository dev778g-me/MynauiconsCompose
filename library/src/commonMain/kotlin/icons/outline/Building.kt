package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Building: ImageVector
    get() {
        if (_Building != null) {
            return _Building!!
        }
        _Building = ImageVector.Builder(
            name = "Outline.Building",
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
                moveTo(14.7f, 2f)
                curveToRelative(1.68f, 0f, 2.52f, 0f, 3.162f, 0.34f)
                arcToRelative(3.06f, 3.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.311f, 1.359f)
                curveToRelative(0.327f, 0.665f, 0.327f, 1.536f, 0.327f, 3.279f)
                verticalLineToRelative(10.044f)
                curveToRelative(0f, 1.743f, 0f, 2.614f, -0.327f, 3.28f)
                arcToRelative(3.06f, 3.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.311f, 1.359f)
                curveTo(17.22f, 22f, 16.38f, 22f, 14.7f, 22f)
                horizontalLineTo(9.3f)
                curveToRelative(-1.68f, 0f, -2.52f, 0f, -3.162f, -0.34f)
                arcToRelative(3.06f, 3.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.311f, -1.359f)
                curveToRelative(-0.327f, -0.665f, -0.327f, -1.536f, -0.327f, -3.279f)
                verticalLineTo(6.978f)
                curveToRelative(0f, -1.743f, 0f, -2.614f, 0.327f, -3.28f)
                arcTo(3.06f, 3.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.138f, 2.34f)
                curveTo(6.78f, 2f, 7.62f, 2f, 9.3f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 21f)
                verticalLineToRelative(-5.5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                horizontalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                verticalLineTo(21f)
                moveTo(10f, 6f)
                horizontalLineTo(8f)
                moveToRelative(2f, 4f)
                horizontalLineTo(8f)
                moveToRelative(8f, -4f)
                horizontalLineToRelative(-2f)
                moveToRelative(2f, 4f)
                horizontalLineToRelative(-2f)
            }
        }.build()

        return _Building!!
    }

@Suppress("ObjectPropertyName")
private var _Building: ImageVector? = null
