package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Briefcase: ImageVector
    get() {
        if (_Briefcase != null) {
            return _Briefcase!!
        }
        _Briefcase = ImageVector.Builder(
            name = "Outline.Briefcase",
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
                moveToRelative(20.953f, 10.587f)
                lineToRelative(-0.692f, 7.2f)
                curveTo(20.067f, 19.551f, 19.403f, 21f, 15.692f, 21f)
                horizontalLineTo(8.308f)
                curveToRelative(-3.71f, 0f, -4.375f, -1.449f, -4.569f, -3.213f)
                lineToRelative(-0.692f, -7.2f)
                moveToRelative(17.906f, 0f)
                curveToRelative(0.25f, -2.196f, -0.397f, -3.987f, -4.338f, -3.987f)
                horizontalLineToRelative(-9.23f)
                curveToRelative(-3.941f, 0f, -4.587f, 1.791f, -4.338f, 3.987f)
                moveToRelative(17.906f, 0f)
                curveTo(18.935f, 11.882f, 16.301f, 13.249f, 14f, 13.5f)
                moveTo(3.047f, 10.587f)
                curveTo(5.065f, 11.882f, 7.699f, 13.249f, 10f, 13.5f)
                moveToRelative(0f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 0f)
                moveToRelative(-4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                moveToRelative(1f, -6.9f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.708f, 0.293f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 4.001f)
                verticalLineTo(6.6f)
            }
        }.build()

        return _Briefcase!!
    }

@Suppress("ObjectPropertyName")
private var _Briefcase: ImageVector? = null
