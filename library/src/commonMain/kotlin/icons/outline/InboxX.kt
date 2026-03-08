package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.InboxX: ImageVector
    get() {
        if (_InboxX != null) {
            return _InboxX!!
        }
        _InboxX = ImageVector.Builder(
            name = "Outline.InboxX",
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
                moveTo(3.25f, 13f)
                horizontalLineToRelative(3.68f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.664f, 0.89f)
                lineToRelative(0.812f, 1.22f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.664f, 0.89f)
                horizontalLineToRelative(1.86f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.664f, -0.89f)
                lineToRelative(0.812f, -1.22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.07f, 13f)
                horizontalLineToRelative(3.68f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(5.45f, 4.11f)
                lineToRelative(-2.162f, 7.847f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 14.082f)
                verticalLineTo(19f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                verticalLineToRelative(-4.918f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.288f, -2.125f)
                lineTo(18.55f, 4.11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.76f, 3f)
                horizontalLineTo(7.24f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.79f, 1.11f)
                moveTo(10.5f, 7f)
                lineToRelative(3f, 3f)
                moveToRelative(0f, -3f)
                lineToRelative(-3f, 3f)
            }
        }.build()

        return _InboxX!!
    }

@Suppress("ObjectPropertyName")
private var _InboxX: ImageVector? = null
