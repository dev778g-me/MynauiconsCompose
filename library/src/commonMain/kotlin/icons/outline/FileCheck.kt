package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.FileCheck: ImageVector
    get() {
        if (_FileCheck != null) {
            return _FileCheck!!
        }
        _FileCheck = ImageVector.Builder(
            name = "Outline.FileCheck",
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
                moveTo(9.728f, 3f)
                horizontalLineTo(7.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.25f, 2.25f)
                verticalLineToRelative(13.5f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 21f)
                horizontalLineToRelative(9f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, -2.25f)
                verticalLineTo(12f)
                moveTo(9.728f, 3f)
                curveTo(10.971f, 3f, 12f, 4.007f, 12f, 5.25f)
                verticalLineTo(7.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, 2.25f)
                horizontalLineToRelative(2.25f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.75f, 12f)
                moveTo(9.728f, 3f)
                curveToRelative(3.69f, 0f, 9.022f, 5.36f, 9.022f, 9f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(10f, 16.242f)
                lineToRelative(1.039f, 1.181f)
                curveToRelative(0.095f, 0.109f, 0.267f, 0.1f, 0.351f, -0.016f)
                lineTo(13.5f, 14.5f)
            }
        }.build()

        return _FileCheck!!
    }

@Suppress("ObjectPropertyName")
private var _FileCheck: ImageVector? = null
