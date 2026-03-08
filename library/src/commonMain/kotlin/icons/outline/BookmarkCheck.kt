package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.BookmarkCheck: ImageVector
    get() {
        if (_BookmarkCheck != null) {
            return _BookmarkCheck!!
        }
        _BookmarkCheck = ImageVector.Builder(
            name = "Outline.BookmarkCheck",
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
                moveTo(7.527f, 20.841f)
                curveTo(6.861f, 21.274f, 6f, 20.772f, 6f, 19.952f)
                verticalLineTo(3.942f)
                curveToRelative(0f, -0.52f, 0.336f, -0.942f, 0.75f, -0.942f)
                horizontalLineToRelative(10.5f)
                curveToRelative(0.414f, 0f, 0.75f, 0.422f, 0.75f, 0.942f)
                verticalLineToRelative(16.01f)
                curveToRelative(0f, 0.82f, -0.861f, 1.322f, -1.527f, 0.89f)
                lineToRelative(-3.946f, -2.562f)
                arcToRelative(0.96f, 0.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.054f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(9.7f, 9.822f)
                lineToRelative(1.379f, 1.576f)
                arcToRelative(0.3f, 0.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.466f, -0.022f)
                lineToRelative(2.8f, -3.876f)
            }
        }.build()

        return _BookmarkCheck!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkCheck: ImageVector? = null
