package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.FileText: ImageVector
    get() {
        if (_FileText != null) {
            return _FileText!!
        }
        _FileText = ImageVector.Builder(
            name = "Outline.FileText",
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
                moveTo(9.478f, 3f)
                horizontalLineTo(7.25f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5.25f)
                verticalLineToRelative(13.5f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.25f, 21f)
                horizontalLineToRelative(9f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, -2.25f)
                verticalLineTo(12f)
                moveTo(9.478f, 3f)
                curveToRelative(1.243f, 0f, 2.272f, 1.007f, 2.272f, 2.25f)
                verticalLineTo(7.5f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 9.75f)
                horizontalLineToRelative(2.25f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 12f)
                moveTo(9.478f, 3f)
                curveToRelative(3.69f, 0f, 9.022f, 5.36f, 9.022f, 9f)
                moveTo(9f, 16.5f)
                horizontalLineToRelative(6f)
                moveToRelative(-6f, -3f)
                horizontalLineToRelative(4f)
            }
        }.build()

        return _FileText!!
    }

@Suppress("ObjectPropertyName")
private var _FileText: ImageVector? = null
